package com.MS1.WelcomeMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WelcomeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeMsApplication.class, args);
	}

}
