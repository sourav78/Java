package com.MS1.WelcomeMS.repo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREETMS")
public interface GreetApiClient {

    @GetMapping("/greet")
    public String invokeGreet();

}
