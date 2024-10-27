package com.exam.ExamBackend.service.impl;

import com.exam.ExamBackend.entity.UserRoles;
import com.exam.ExamBackend.entity.Users;
import com.exam.ExamBackend.exception.UserAlreadyExistException;
import com.exam.ExamBackend.repo.RoleRepo;
import com.exam.ExamBackend.repo.UserRepo;
import com.exam.ExamBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImplements implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Users createUser(Users user, Set<UserRoles> userRoles) throws Exception {

        if(true) throw new Exception();

            //Find the user by username
            Users exitingUser = userRepo.findByUsername(user.getUsername());

            //If user already exist then throw exception
            if(exitingUser != null){
                System.out.println("User Already exit");
                throw new UserAlreadyExistException("This user is already exit");
            }

            //Save the user role in db
            for (UserRoles roles : userRoles){
                roleRepo.save(roles.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            //Save the user in Database
            Users savedUser = userRepo.save(user);

            return savedUser;
    }
}
