package com.example.boot.boot3.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String hi() {
        return "Hi! Time on server is " + LocalDateTime.now();
    }

}
