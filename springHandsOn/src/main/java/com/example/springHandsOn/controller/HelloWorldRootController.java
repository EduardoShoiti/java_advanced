package com.example.springHandsOn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloWorldRootController {
    @GetMapping()
    public ResponseEntity<String> helloWorldRoot() {
        return ResponseEntity.ok("Hello World Root");
    }
}
