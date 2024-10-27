package com.exam.ExamBackend.repo;

import com.exam.ExamBackend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {

    public Users findByUsername(String username);

    @Query("SELECT u FROM Users u LEFT JOIN FETCH u.userRoles ur LEFT JOIN FETCH ur.role")
    public List<Users> findAllWithRoles();
}
