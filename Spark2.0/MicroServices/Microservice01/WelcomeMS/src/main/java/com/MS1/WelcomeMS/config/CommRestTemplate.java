package com.MS1.WelcomeMS.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommRestTemplate {

    @Bean
    public RestTemplate getInstance(){
        return new RestTemplate();
    }
}
