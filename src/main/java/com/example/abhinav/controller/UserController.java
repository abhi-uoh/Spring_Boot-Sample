package com.example.abhinav.controller;

import com.example.abhinav.entity.User;
import com.example.abhinav.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("/userlist")
    public List<User>listOfUsers()
    {
        return userRepository.findAll();
    }






}
