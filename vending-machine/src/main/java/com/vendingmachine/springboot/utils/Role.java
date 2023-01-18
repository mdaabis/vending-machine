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

    public static Role getRoleEnum(String role) {
        switch (role.toLowerCase()) {
            case "buyer":
                return Role.BUYER;
            case "seller":
                return Role.SELLER;
            default:
                throw new IllegalArgumentException("Role [" + role
                        + "] not supported.");
        }
    }
}
