package com.MS1.GreetMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    Environment environment;

    @GetMapping("/greet")
    public String wish(){

        String PORT = environment.getProperty("server.port");

        return "From Greet : PORT -> "+PORT;
    }

}
