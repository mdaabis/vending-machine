package com.vendingmachine.springboot.models;

public class Transaction
{
    private String mUser;
    private String mProductPurchased;
    private double mSpent;
    private double mChange;

    public Transaction(String mUser, String mProductPurchased, double mSpent, double mChange)
    {
        this.mUser = mUser;
        this.mProductPurchased = mProductPurchased;
        this.mSpent = mSpent;
        this.mChange = mChange;
    }

    public String getUser() 
    {
        return mUser;
    }

    public void setUser(String mUser) 
    {
        this.mUser = mUser;
    }

    public String getProductPurchased() 
    {
        return mProductPurchased;
    }

    public void setProductPurchased(String mProductPurchased) 
    {
        this.mProductPurchased = mProductPurchased;
    }

    public double getSpent() 
    {
        return mSpent;
    }

    public void setSpent(double mSpent) 
    {
        this.mSpent = mSpent;
    }

    public double getChange() 
    {
        return mChange;
    }

    public void setChange(double mChange) 
    {
        this.mChange = mChange;
    }
}
