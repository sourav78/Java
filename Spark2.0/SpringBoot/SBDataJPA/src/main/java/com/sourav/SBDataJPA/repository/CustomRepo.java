package com.sourav.SBDataJPA.repository;

import com.sourav.SBDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepo extends JpaRepository<Student, Integer> {
    public Student findByName(String name);
    public Student findByEmail(String email);
}
