package com.javatutorial.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hey Roshan...Good Job!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Running";
    }
}
