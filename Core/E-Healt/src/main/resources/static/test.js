var app = angular.module("E-Healt", []);
app.controller("testController", function ($scope, $http) {
    console.log("test controller working...");
    var data = {id: "10",
                type: "Smartphone"};
    $scope.test = function(){
        console.log("test function working...");
        $http({
                    method: 'POST',
                    url: '/reader',
                    params: data
                })
                    .success(function (results) {
                        console.log(results);
                    })
                    .error(function () {
                        console.log("error");
                    });
    }
});