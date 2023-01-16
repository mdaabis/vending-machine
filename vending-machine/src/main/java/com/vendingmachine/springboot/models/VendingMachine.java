package com.vendingmachine.springboot.models;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine
{
    private static VendingMachine SINGLETON_INSTANCE = null;

    // Inventory
    private Map<Product, Integer> products;
    private int itemsSold;

    // Money
    private BigDecimal balance;
    private BigDecimal changeReturned;

    public VendingMachine()
    {
        products = new HashMap<>();
        itemsSold = 0;
        balance = new BigDecimal(0);
        changeReturned = new BigDecimal(0);
    }

    public VendingMachine getInstance()
    {
        if (SINGLETON_INSTANCE == null)
        {
            SINGLETON_INSTANCE = new VendingMachine();
        }
        return SINGLETON_INSTANCE;
    }

    public Map<Product, Integer> getProducts()
    {
        return products;
    }

    public void setProducts(Map<Product, Integer> products)
    {
        this.products = products;
    }

    public int getItemsSold()
    {
        return itemsSold;
    }

    public void setItemsSold(int itemsSold)
    {
        this.itemsSold = itemsSold;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public void setBalance(BigDecimal balance)
    {
        this.balance = balance;
    }

    public BigDecimal getChangeReturned()
    {
        return changeReturned;
    }

    public void setChangeReturned(BigDecimal changeReturned)
    {
        this.changeReturned = changeReturned;
    }
}
