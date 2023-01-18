package com.vendingmachine.springboot.controllers;

import com.vendingmachine.springboot.models.User;
import com.vendingmachine.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam("username") String username){
            return userRepository.findByUsername(username);
//        return searchParam
//                .map(userRepository::getUsers)
//                .orElse(userRepository.findAll());
    }

//    @GetMapping("/user")
//    public List<User> get
}
