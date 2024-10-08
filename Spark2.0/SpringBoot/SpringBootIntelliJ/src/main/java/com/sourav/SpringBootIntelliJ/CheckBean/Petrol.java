package com.sourav.SpringBootIntelliJ.CheckBean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Engine {

    public Petrol(){
        System.out.println("Petrol Class started");
    }

    @Override
    public void start(){
        System.out.println("Petrol engine started.");
    }
}
