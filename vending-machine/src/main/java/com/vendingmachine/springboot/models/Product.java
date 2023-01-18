package com.vendingmachine.springboot.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int productId;

    @NotNull
    @Column(name = "product_name", unique = true)
    private String productName;

    @NotNull
    @Column(name = "product_quantity", unique = true)
    private String productQuantity;

    @NotNull
    @Column(name = "cost")
    private BigDecimal cost;

    @NotNull
    @Column(name = "seller_id")
    private String sellerId;

    public int getProductId() {
        return productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

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