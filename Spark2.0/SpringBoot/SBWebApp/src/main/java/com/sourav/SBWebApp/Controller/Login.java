package com.sourav.SBWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @RequestMapping("/login")
    public String greet(){
        return "This is login...";
    }

}
