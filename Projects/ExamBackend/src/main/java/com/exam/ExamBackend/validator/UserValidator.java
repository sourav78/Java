package com.exam.ExamBackend.validator;

import com.exam.ExamBackend.entity.Users;
import com.exam.ExamBackend.exception.UserFieldException;

public class UserValidator {

    //This method is used to validate the required field of new users
    public static void validateNewUser(Users users) throws Exception {

        if (users.getUsername().isEmpty()){
            throw new UserFieldException("Username is required");
        }
        if (users.getPassword().isEmpty()){
            throw new UserFieldException("Password is required");
        }
        if (users.getEmail().isEmpty()){
            throw new UserFieldException("Email is required");
        }
        if (users.getFirstName().isEmpty()){
            throw new UserFieldException("First Name is required");
        }

    }

}
