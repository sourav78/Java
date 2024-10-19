package com.sourav.SpringSecurity01.controller;

import com.sourav.SpringSecurity01.Entity.Users;
import com.sourav.SpringSecurity01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/u")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<Users> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public String createUser(@RequestBody Users user){
        return userService.saveUser(user);
    }

}
