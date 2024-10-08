package com.sourav.SpringBootAnnoatations.DataInjectionAnnotations.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JusPay implements PaymentPartner {

    @Override
    public void payment(String amount) {
        System.out.println("JusPay payment done for : "+ amount);
    }
}
