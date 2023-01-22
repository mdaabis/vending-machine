package com.vendingmachine.springboot.services;

import com.vendingmachine.springboot.error.UserOrError;
import com.vendingmachine.springboot.models.User;
import com.vendingmachine.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public UserOrError createUser(User user)
    {
        if(userRepository.userExists(user.getUsername()) == 0)
                return new UserOrError(userRepository.save(user), HttpStatus.OK, "User saved successfully");

        return new UserOrError(null, HttpStatus.BAD_REQUEST, "User creation unsuccessful as username already in use");
    }

    public boolean userExists(User user)
    {
        return userRepository.userExists(user.getUsername()) > 0;
    }
}
