package com.vendingmachine.springboot.utils;

public enum OrderStatus
{
    SUCCESS("success"),
    FAIL("fail");

    private final String status;

    OrderStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
}
