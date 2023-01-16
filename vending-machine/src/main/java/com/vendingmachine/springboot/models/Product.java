package com.vendingmachine.springboot.models;

import java.math.BigDecimal;

public class Product
{
    private String productName;
//    private int amountAvailable;
    private BigDecimal cost;
    private String sellerId;

    public Product(String productName, BigDecimal cost, String sellerId)
    {
        this.productName = productName;
//        this.amountAvailable = amountAvailable;
        this.cost = cost;
        this.sellerId = sellerId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }
//
//    public int getAmountAvailable()
//    {
//        return amountAvailable;
//    }
//
//    public void setAmountAvailable(int amountAvailable)
//    {
//        this.amountAvailable = amountAvailable;
//    }

    public BigDecimal getCost()
    {
        return cost;
    }

    public void setCost(BigDecimal cost)
    {
        this.cost = cost;
    }

    public String getSellerId()
    {
        return sellerId;
    }

    public void setSellerId(String sellerId)
    {
        this.sellerId = sellerId;
    }
}