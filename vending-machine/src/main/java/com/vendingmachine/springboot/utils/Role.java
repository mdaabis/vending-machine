package com.vendingmachine.springboot.utils;

public enum Role
{
    BUYER("buyer"),
    SELLER("seller");

    private final String role;

    Role(String role)
    {
        this.role = role;
    }

    public String getRole()
    {
        return role;
    }

    public static Role getRoleEnum(String roleString)
    {
        return switch (roleString.toLowerCase()) {
            case "buyer" -> Role.BUYER;
            case "seller" -> Role.SELLER;
            default -> throw new IllegalArgumentException("Role [" + roleString
                    + "] not supported.");
        };
    }
}
