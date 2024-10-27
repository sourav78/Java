package com.exam.ExamBackend.repo;

import com.exam.ExamBackend.entity.Roles;
import com.exam.ExamBackend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Long> {
}
