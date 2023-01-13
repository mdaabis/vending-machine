package com.vendingmachine.springboot.models;

import com.vendingmachine.springboot.utils.Role;

import java.math.BigDecimal;

public class User
{
    private String username;
    private String password;
    private Role role;
    private BigDecimal deposit;

    public User(String username, String password, Role role, BigDecimal deposit)
    {
        this.username = username;
        this.password = password;
        this.role = role;
        this.deposit = deposit;
    }
}
