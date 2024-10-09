package com.sourav.SBDataJPA.service;

import com.sourav.SBDataJPA.entity.Student;
import com.sourav.SBDataJPA.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String saveStudent(Student student){
        try {
            studentRepo.save(student);
            return "Student save successfully.";
        }catch (Exception e){
            System.out.println( e.getMessage());
            if(e.getMessage().contains("Key (email)")){
                return "This email is already exist";
            }
            return "Internal server error";
        }
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(int id) {
        try{
            return studentRepo.findById(id);
        }catch (Exception e){
            return null;
        }
    }

    public String deleteStudentById(int id) {
        try{
            studentRepo.deleteById(id);
            return "Student deleted successfully.";
        }catch (Exception e){
            System.out.println("000000000000000000"+e.getMessage());
            return "Student not deleted";
        }
    }
}
