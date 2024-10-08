package com.sourav.SpringBootAnnoatations.ConfigurationAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Instagram {

    @Autowired
    Reels reels;

    @Autowired
    LocalDateTime localDateTime;

    public void play(){
        System.out.println("Played at : " + localDateTime);
        reels.dance();
    }
}
