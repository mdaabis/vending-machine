package com.vendingmachine.springboot.models;

public class Product {

    private String mProductName;
    private int mAmountAvailable;
    private double mCost;
    private String mSellerId;

    public Product(String mProductName, int mAmountAvailable, double mCost, String mSellerId) {
        this.mProductName = mProductName;
        this.mAmountAvailable = mAmountAvailable;
        this.mCost = mCost;
        this.mSellerId = mSellerId;
    }

    public String getProductName() {
        return mProductName;
    }

    public void setProductName(String mProductName) {
        this.mProductName = mProductName;
    }

    public int getAmountAvailable() {
        return mAmountAvailable;
    }

    public void setAmountAvailable(int mAmountAvailable) {
        this.mAmountAvailable = mAmountAvailable;
    }

    public double getCost() {
        return mCost;
    }

    public void setCost(double mCost) {
        this.mCost = mCost;
    }

    public String getSellerId() {
        return mSellerId;
    }

    public void setSellerId(String mSellerId) {
        this.mSellerId = mSellerId;
    }
}