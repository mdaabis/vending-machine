package com.vendingmachine.springboot.utils;

public enum Role
{
    SELLER("seller"),
    BUYER("buyer");

    private final String role;

    Role(String role)
    {
        this.role = role;
    }

    public String getRole()
    {
        return role;
    }
}
