package com.springProfiles.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/restApi/demo")
@RestController
public class GreetingApiResource {


    @Value("${spring.message}")
    private String message;

    @GetMapping
    public String hello() {
        return message;
    }
}
