package com.vendingmachine.springboot.controllers;

import com.vendingmachine.springboot.error.UserOrError;
import com.vendingmachine.springboot.models.User;
import com.vendingmachine.springboot.repositories.UserRepository;
import com.vendingmachine.springboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam("username") Optional<String> usernameSubstring)
    {
        return usernameSubstring
                .map(userRepository::getUsers)
                .orElse(userRepository.findAll());
    }

    @PostMapping(value = "/create-user", consumes = {"application/json"})
    public UserOrError createUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @PostMapping(value = "/user-exists", consumes = {"application/json"})
    public boolean userExists(@RequestBody User user)
    {
        return userService.userExists(user);
    }
}
