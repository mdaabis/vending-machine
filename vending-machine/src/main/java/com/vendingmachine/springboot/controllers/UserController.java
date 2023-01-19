package com.vendingmachine.springboot.controllers;

import com.vendingmachine.springboot.models.User;
import com.vendingmachine.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam("username") Optional<String> usernameSubstring)
    {
        return usernameSubstring
                .map(userRepository::getUsers)
                .orElse(userRepository.findAll());
    }

    @PostMapping(value = "/create-user", consumes = {"application/json"})
    public User createUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
}
