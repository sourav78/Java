package com.exam.ExamBackend.controller;

import com.exam.ExamBackend.entity.Roles;
import com.exam.ExamBackend.entity.UserRoles;
import com.exam.ExamBackend.entity.Users;
import com.exam.ExamBackend.response.ResponseHandler;
import com.exam.ExamBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //Create user controller
    @PostMapping("")
    public ResponseEntity<Object> createUser(@RequestBody Users user) throws Exception {

        //Assign role to user
        Roles roles = new Roles();
        roles.setRoleId(45l);
        roles.setRoleName("NORMAL");

        Set<UserRoles> userRolesSet = new HashSet<>();

        //Join user and their role
        UserRoles userRoles = new UserRoles();
        userRoles.setUser(user);
        userRoles.setRole(roles);

        userRolesSet.add(userRoles);

        //Save the user
        Users savedUser = userService.createUser(user, userRolesSet);

        //Handle the response
        return ResponseHandler.responseBuilder(
                "User created Successfully",
                HttpStatus.OK,
                savedUser
        );
    }


}
