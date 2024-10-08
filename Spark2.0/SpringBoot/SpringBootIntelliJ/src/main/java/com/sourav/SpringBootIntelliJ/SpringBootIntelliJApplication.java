package com.sourav.SpringBootIntelliJ;

import com.sourav.SpringBootIntelliJ.CheckBean.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootIntelliJApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootIntelliJApplication.class, args);
		Car car = applicationContext.getBean(Car.class);
		car.drive();
	}

}
