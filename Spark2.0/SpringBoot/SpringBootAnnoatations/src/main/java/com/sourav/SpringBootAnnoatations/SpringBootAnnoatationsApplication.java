package com.sourav.SpringBootAnnoatations;

import com.sourav.SpringBootAnnoatations.ConfigurationAnnotation.beans.Instagram;
import com.sourav.SpringBootAnnoatations.DataInjectionAnnotations.beans.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAnnoatationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAnnoatationsApplication.class, args);

//		Instagram insta = context.getBean(Instagram.class);
//		insta.play();

		Flipkart flipkartPayment = context.getBean(Flipkart.class);
		flipkartPayment.paymentGateway("10000");
	}

}
