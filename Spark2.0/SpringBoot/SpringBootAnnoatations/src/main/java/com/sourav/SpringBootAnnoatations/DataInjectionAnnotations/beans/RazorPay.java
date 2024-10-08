package com.sourav.SpringBootAnnoatations.DataInjectionAnnotations.beans;

import org.springframework.stereotype.Component;

@Component
public class RazorPay implements PaymentPartner {

    @Override
    public void payment(String amount) {
        System.out.println("RazorPay payment done for : "+ amount);
    }
}
