var fs = require("fs");
var http = require('http');
var express = require('express');
var querystring = require('querystring');
var app = express();
app.use(express.static('StaticFiles'));
var server;

var subscribers = [];
var publications = {
    data: [],
    index: -1
};
var continuousPublishing;

app.get("/", function (req, res) {
    var response = fs.readFile("microservice.html", (err, data) => {
        if (err) {
            res.end(404, "There was an error while processing your request!");
            console.log(err);
            return;
        }

        res.end(data.toString());
    })
    console.log("[Publisher] Received a request to the homepage!");
})

app.get("/Subscribe/:addr/:port", function (req, res) {
    if (subscribers.contains({ 'address': req.params.addr, 'port': req.params.port }) >= 0) {
        res.end("[Publisher] The subscriber already exists.");
        return;
    }

    subscribers.push({ 'address': req.params.addr, 'port': req.params.port });

    console.log("[Publisher] Received a subscriber from: " + req.params.addr + ", port: " + req.params.port);
    res.end("[Publisher] A new subscriber was registered.");
})

app.get('/Unsubscribe/:addr/:port', function (req, res) {
    console.log("[Publisher] Received an unsubscription from: " + req.params.addr + ", port: " + req.params.port);

    var index = subscribers.contains({ 'address': req.params.addr, 'port': req.params.port })
    if (index >= 0) {
        subscribers.splice(index, 1);
        console.log("[Publisher] Subscription was found and removed: " + req.connection.address().address + ", port: " + req.connection.address().port)
        res.end("[Publisher] A subscription has been removed.");
        return;
    }

    res.end("[Publisher] There is no subscription to remove.");
})

app.get('/Publish', function (req, res) {
    if (subscribers.length == 0) {
        console.log("[Publisher] There are no subscribers available.")
        res.end("[Publisher] There are no subscribers available.")
        return;
    }

    publish();

    res.end("[Publisher] The message " + publications.index + " has been published successfully.");
})

app.get('/PublishStart/:intervalMs', function (req, res) {
    console.log("[Publisher] Publishing at " + req.params.intervalMs + "ms interval...");
    res.end("[Publisher] Started publishing at " + req.params.intervalMs + "ms intervals.");

    continuousPublishing = setInterval(publish, req.params.intervalMs, res);
})

app.get('/PublishStop', function (req, res) {
    console.log("[Publisher] Stopped the publishing at random intervals...");
    res.end("[Publisher] Stopped the publishing at random intervals.");

    clearInterval(continuousPublishing);
})

fs.readFile("rawData.txt", "UTF8", function (err, data) {
    if (err) {
        console.log("Error while reading publications. Error message: " + err.message);
        return;
    }

    console.log("[Publisher Initializing] Reading the publications...");
    publications.data = data.trim().split("\n");
    publications.index = 0;

    for (var i = 0; i < publications.length; i++)
        publications.data[i] = publications.data[i].trim();

    if (publications.data.length == 0) {
        console.log("[Publisher Initializing] There are no publications to be served. Exiting...");
        return;
    }

    console.log("[Publisher Initializing] Length of publications: " + publications.data.length);

    server = app.listen(8080, "127.0.0.1", function () {

        var host = server.address().address
        var port = server.address().port

        console.log("[Publisher Initializing] The publisher is listening for commands at http://%s:%s", host, port)
    })
});

//////////////////////////////////////////////////
//  Functions
//////////////////////////////////////////////////

function rand(min, max) {
    return Math.floor(Math.random() * (max - min)) + min;
}

function rand(max) {
    return Math.floor(Math.random() * max);
}

subscribers.contains = function (val) {
    for (var i = 0; i < this.length; i++)
        if (this[i] === val)
            return i;

    return -1;
}

function publish(res) {
    var message = publications.data[publications.index++];
    if (publications.index >= publications.data.length) {
        console.log("[Publisher] Reinitialized the publication index to 0 as it reached " + publications.data.length + ".");
        publications.index = 0;
    }

    var count = 0;
    var postData = querystring.stringify({ 'notification': message.trim() });

    for (var i = 0; i < subscribers.length; i++) {
        console.log("[Publisher] Sending publication to: " + subscribers[i].address + " port: " + subscribers[i].port);
        var subscriberReq = http.request({
            'hostname': subscribers[i].address,
            'port': subscribers[i].port,
            'path': "/PublishEndpoint",
            'method': 'POST',
            'headers': {
                'accept': 'text/plain',
                'Content-Type': 'application/x-www-form-urlencoded',
                'Content-Length': Buffer.byteLength(postData)
            }
        }, function (resp) {
            resp.on("end", function (data) {
                if (++count == subscribers.length)
                    console.log("[Publisher] The publication has been delivered to " + count + " subscribers.");
            });
        });

        subscriberReq.on("error", err => {
            console.log("![Publisher] There was an error while publishing to subscriber " + i + " Message:" + err.message);
        })

        subscriberReq.end(postData);
    }
}