package com.sourav.SBDataJPA.controller;


import com.sourav.SBDataJPA.entity.Student;
import com.sourav.SBDataJPA.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/custom")
public class CustomFinderController {

    @Autowired
    CustomService customService;

    @GetMapping("/student")
    public Student findByName(@RequestParam("name") String name, @RequestParam("email") String email){
        System.out.println("Name:"+name);
        return customService.findByName(name, email);
    }

    @GetMapping("/age")
    public Student findByAge(){
        return customService.findByAge();
    }

    @GetMapping("/age/{age}")
    public List<Student> findLessAge(@PathVariable int age){
        return customService.findLessAge(age);
    }
}
