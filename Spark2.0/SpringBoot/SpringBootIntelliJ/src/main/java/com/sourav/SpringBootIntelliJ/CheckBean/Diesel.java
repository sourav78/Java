package com.sourav.SpringBootIntelliJ.CheckBean;


import org.springframework.stereotype.Component;

@Component
public class Diesel implements Engine{

    public Diesel(){
        System.out.println("Diesel engine started");
    }
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}
