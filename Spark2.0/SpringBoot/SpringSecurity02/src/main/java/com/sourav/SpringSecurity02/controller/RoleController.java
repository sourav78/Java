package com.sourav.SpringSecurity02.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

//    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/cred")
    public String adminMethod(){
        return "Admin Cred";
    }

//    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/pub")
    public String publicMethod(){
        return "Nothing Here";
    }

}
