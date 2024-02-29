package com.example.springHandsOn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/um")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world 1");
    }

    @GetMapping("/dois")
    public ResponseEntity<String> helloWorldDois() {
        return ResponseEntity.ok("Hello world 2");
    }
}
