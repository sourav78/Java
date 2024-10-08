package com.sourav.SpringBootAnnoatations.DataInjectionAnnotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

    @Autowired
    @Qualifier("razorPay")
    PaymentPartner paymentPartner;

    @Value("${PAYMENT_CRED}")
    private String apiKey;

    public void paymentGateway(String amount){
        System.out.println("API key : " + apiKey);
        paymentPartner.payment(amount);
    }
}
