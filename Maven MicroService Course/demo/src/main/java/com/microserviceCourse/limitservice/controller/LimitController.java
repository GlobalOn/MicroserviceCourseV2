package com.microserviceCourse.limitservice.controller;

import com.microserviceCourse.limitservice.bean.Limits;
import com.microserviceCourse.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    private Configuration configuration;

    @Autowired
    public LimitController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
