package com.example.boot.boot3.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MyRestController {

    @GetMapping("/")
    public String hi() {
        return "Hi! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run for 5km!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is going to be a lucky day";
    }

    @Value("{c.name}")
    private String cName;

    @GetMapping("/c")
    public String getCName() {
        return "C: " + cName;
    }

}
