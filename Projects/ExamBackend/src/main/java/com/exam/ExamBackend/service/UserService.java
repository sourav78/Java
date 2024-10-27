package com.exam.ExamBackend.service;

import com.exam.ExamBackend.entity.UserRoles;
import com.exam.ExamBackend.entity.Users;

import java.util.Set;

public interface UserService {

    public Users createUser(Users user, Set<UserRoles> userRoles) throws Exception;

}
