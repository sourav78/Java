package com.sourav.SpringBootAnnoatations.DataInjectionAnnotations.beans;

import org.springframework.stereotype.Component;

@Component
public class PaytmPay implements PaymentPartner {

    @Override
    public void payment(String amount) {
        System.out.println("Paytm payment done for : "+ amount);
    }
}
