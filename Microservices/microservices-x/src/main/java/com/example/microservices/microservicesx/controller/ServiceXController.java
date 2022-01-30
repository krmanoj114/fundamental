package com.example.microservices.microservicesx.controller;

import com.example.microservices.microservicesx.bean.Limits;
import com.example.microservices.microservicesx.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceXController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/microservice-x")
    public Limits retrieveLimits(){
        // return new Limits(51, 1000);
        return  new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
