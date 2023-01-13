package com.vendingmachine.springboot.models;

import java.math.BigDecimal;

public class Transaction
{
    private String user;
    private String productPurchased;
    private BigDecimal spent;
    private BigDecimal change;

    public Transaction(String user, String productPurchased, BigDecimal spent, BigDecimal change)
    {
        this.user = user;
        this.productPurchased = productPurchased;
        this.spent = spent;
        this.change = change;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getProductPurchased()
    {
        return productPurchased;
    }

    public void setProductPurchased(String productPurchased)
    {
        this.productPurchased = productPurchased;
    }

    public BigDecimal getSpent()
    {
        return spent;
    }

    public void setSpent(BigDecimal spent)
    {
        this.spent = spent;
    }

    public BigDecimal getChange()
    {
        return change;
    }

    public void setChange(BigDecimal change)
    {
        this.change = change;
    }
}
