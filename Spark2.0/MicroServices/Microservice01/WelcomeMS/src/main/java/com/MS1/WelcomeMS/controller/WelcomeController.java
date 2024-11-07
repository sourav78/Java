package com.MS1.WelcomeMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/welcome")
    public String welcome(){

        String res = restTemplate.getForObject("http://localhost:8088/greet", String.class);

        return res+"Welcome Microservice";
    }
}
