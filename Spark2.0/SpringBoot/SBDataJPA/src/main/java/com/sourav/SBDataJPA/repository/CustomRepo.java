package com.sourav.SBDataJPA.repository;

import com.sourav.SBDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomRepo extends JpaRepository<Student, Integer> {
    public Student findByName(String name);
    public Student findByEmail(String email);

    //Write custom queries
    //JPQL Query
    @Query("SELECT s FROM Student s WHERE s.age = 20")
    public Student findStudentByAge();

    @Query("SELECT s FROM Student s WHERE s.age < :age")
    public List<Student> findStudentsWithAgeLessThan(@Param("age") int age);

    //Native Query
    @Query(value = "SELECT * FROM student_info", nativeQuery = true)
    public List<Student> getAllStudents();
}
