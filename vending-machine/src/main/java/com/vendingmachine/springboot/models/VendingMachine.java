package com.vendingmachine.springboot.models;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class VendingMachine
{
    // Inventory
    private Map<Product, Integer> products;
    private int itemsSold;

    // Money
    private BigDecimal balance;
    private BigDecimal changeReturned;

    
}
