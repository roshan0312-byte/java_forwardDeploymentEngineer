package com.javatutorial.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello AWS. How you doing?🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Running";
    }

    @GetMapping("/intro")
    public String myName() {return "Hello Roshan Shaw";}
}
