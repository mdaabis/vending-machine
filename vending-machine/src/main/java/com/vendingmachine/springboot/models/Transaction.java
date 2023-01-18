package com.vendingmachine.springboot.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
public class Transaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int transactionId;

    @NotNull
    @Column(name = "buyer_id")
    private String buyerId;

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @NotNull
    @Column(name = "cost")
    private BigDecimal cost;
    
    @NotNull
    @Column(name = "spent")
    private BigDecimal spent;
    
    @NotNull
    @Column(name = "change_given")
    private BigDecimal change;

//    public Transaction()
//    {
//    }
//
//    public Transaction(String buyerId, String productName, BigDecimal cost, BigDecimal spent, BigDecimal change) {
//        this.buyerId = buyerId;
//        this.productName = productName;
//        this.cost = cost;
//        this.spent = spent;
//        this.change = change;
//    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getBuyerId()
    {
        return buyerId;
    }

    public void setBuyerId(String buyer)
    {
        this.buyerId = buyer;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
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
