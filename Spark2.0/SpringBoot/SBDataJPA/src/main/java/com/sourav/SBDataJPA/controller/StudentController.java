package com.sourav.SBDataJPA.controller;

import com.sourav.SBDataJPA.entity.Student;
import com.sourav.SBDataJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public String saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") int studentId){
        return studentService.deleteStudentById(studentId);
    }
}
