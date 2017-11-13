package com.example.demo;

import core.DataParser;
import core.decisionMaking.Decision;
import devices.abstractFactory.AbstractDevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class Mapping {
    DataParser dataParser;
    String deviceType;
    @RequestMapping(value = "/reader", method = RequestMethod.POST)
    public @ResponseBody
    int readData(@RequestParam() Map<String,String> data){
        System.out.println(data);
        dataParser = new DataParser();
        deviceType = data.get("type");
        if (dataParser.isRelevant(deviceType)) {
            AbstractDevice currentDevice = dataParser.createSingleDevice(data);
            dataParser.saveInstanceDevice(data);
            Decision decision = new Decision();
            decision.makeDecision(currentDevice);
        }
        return 200;
    }
}
