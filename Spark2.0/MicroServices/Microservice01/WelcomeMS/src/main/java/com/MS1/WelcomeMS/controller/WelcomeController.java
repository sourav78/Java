package com.MS1.WelcomeMS.controller;

import com.MS1.WelcomeMS.repo.GreetApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    GreetApiClient greetApiClient;

    @GetMapping("/welcome")
    public String welcome(){

//        String res = restTemplate.getForObject("http://localhost:8088/greet", String.class);

        String res = greetApiClient.invokeGreet();

        return res+"Welcome Microservice";
    }
}
