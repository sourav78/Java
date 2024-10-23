package com.sourav.SpringSecurity01.service;

import com.sourav.SpringSecurity01.Entity.Users;
import com.sourav.SpringSecurity01.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JWTService jwtService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public List<Users> getAllUsers(){

        try{
            return userRepo.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public String saveUser(Users user){

        try{
            user.setPassword(encoder.encode(user.getPassword()));
            userRepo.save(user);
            return "User created successfully";
        }catch (Exception e){
            e.printStackTrace();
            return "Internal server error";
        }
    }

    public String verifyUser(Users user) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
        );

        if(authentication.isAuthenticated()){
            return jwtService.generateToken(user.getUsername());
        }
        return "Failed to login";
    }
}
