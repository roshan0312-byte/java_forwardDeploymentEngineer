package com.javatutorial.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello from EC2.This is running using Elastic IP.";
    }

    @GetMapping("/health")
    public String health() {
        return "This app is healthy currently";
    }
}
