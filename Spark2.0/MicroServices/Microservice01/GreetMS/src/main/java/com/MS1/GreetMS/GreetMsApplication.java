package com.MS1.GreetMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetMsApplication.class, args);
	}

}
