package com.sourav.SBWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/")
    public String greet(){
        return "Hello Spring web";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return
                "This is my about page";
    }
}
