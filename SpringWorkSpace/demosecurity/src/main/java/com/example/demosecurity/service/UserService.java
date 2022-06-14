package com.example.demosecurity.service;


import com.example.demosecurity.entity.User;
import com.example.demosecurity.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registration);
}
