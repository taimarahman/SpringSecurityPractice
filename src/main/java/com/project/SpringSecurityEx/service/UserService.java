package com.project.SpringSecurityEx.service;

import com.project.SpringSecurityEx.model.Users;
import com.project.SpringSecurityEx.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users register(Users user){
        return userRepo.save(user);
    }
}
