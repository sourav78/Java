package com.sourav.SpringSecurity02.repo;

import com.sourav.SpringSecurity02.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserRole, Integer> {
    Optional<UserRole> findByEmail(String email);
}
