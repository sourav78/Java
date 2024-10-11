package com.sourav.SBDataJPA.service;

import com.sourav.SBDataJPA.entity.Student;
import com.sourav.SBDataJPA.repository.CustomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomService {

    @Autowired
    CustomRepo customRepo;

    public Student findByName(String name, String email){
        if(name == ""){
            return customRepo.findByEmail(email);
        }else {
            return customRepo.findByName(name);
        }
    }

    public Student findByAge(){
        return customRepo.findStudentByAge();
    }

    public List<Student> findLessAge(int age){
        return customRepo.findStudentsWithAgeLessThan(age);
    }
}
