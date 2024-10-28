package com.exam.ExamBackend.service.impl;

import com.exam.ExamBackend.entity.UserDto;
import com.exam.ExamBackend.entity.UserRoles;
import com.exam.ExamBackend.entity.Users;
import com.exam.ExamBackend.exception.ResourceNotFoundException;
import com.exam.ExamBackend.exception.UserAlreadyExistException;
import com.exam.ExamBackend.exception.UserFieldException;
import com.exam.ExamBackend.repo.RoleRepo;
import com.exam.ExamBackend.repo.UserRepo;
import com.exam.ExamBackend.service.UserService;
import com.exam.ExamBackend.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImplements implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Users createUser(Users user, Set<UserRoles> userRoles) {

        //Find the user by username
        Users exitingUser = userRepo.findByUsername(user.getUsername());

        //If user already exist then throw exception
        if(exitingUser != null){
            throw new UserAlreadyExistException("This user is already exit");
        }

        //Validate the users required field
        UserValidator.validateNewUser(user);

        //Save the user role in db
        for (UserRoles roles : userRoles){
            roleRepo.save(roles.getRole());
        }

        user.getUserRoles().addAll(userRoles);
        //Save the user in Database
        Users savedUser = userRepo.save(user);

        return savedUser;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepo.findAllWithRoles().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public Optional<Users> getUserById(Long id) {

        if(id == null){
            throw new UserFieldException("User ID is required.");
        }

        //Get the user from database
        Optional<Users> user = userRepo.findById(id);

        //Check the user is empty or not if empty throw exception
        if(user.isEmpty()){
            throw new ResourceNotFoundException("User not found");
        }

        return user;
    }

    @Override
    public boolean deleteUserById(Long id) {
        if(id == null){
            throw new UserFieldException("User ID is required.");
        }

        //Get the user from database
        Optional<Users> user = userRepo.findById(id);

        //Check the user is empty or not if empty throw exception
        if(user.isEmpty()){
            throw new ResourceNotFoundException("User not found");
        }

        //Delete the by id
        userRepo.deleteById(id);

        return true;
    }

    private UserDto convertToDto(Users user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setEmail(user.getEmail());
        dto.setPhone(user.getPhone());
        dto.setProfile(user.getProfile());
        dto.setEnabled(user.isEnabled());
        dto.setRoles(user.getUserRoles().stream().map(ur -> ur.getRole().getRoleName()).collect(Collectors.toSet()));
        return dto;
    }
}
