package com.divyaranjansahoo.metrics_reporter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String hello() {
        return "This is working! ~ Divyaranjan Sahoo";
    }
}
