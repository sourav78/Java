package com.exam.ExamBackend.service;

import com.exam.ExamBackend.entity.UserRoles;
import com.exam.ExamBackend.entity.Users;
import com.exam.ExamBackend.entity.UserDto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserService {

    public Users createUser(Users user, Set<UserRoles> userRoles) throws Exception;

    public List<UserDto> getAllUsers();

    public Optional<Users> getUserById(Long id);
}
