package com.MS1.GreetMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String wish(){
        return "Hello Microservice";
    }

}
