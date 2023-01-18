//package com.vendingmachine.springboot.models;
//
//import jakarta.persistence.*;
//import jakarta.transaction.Transactional;
//import jakarta.validation.constraints.NotNull;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Transactional
//@Data
//@NoArgsConstructor
//@Table(name = "vending_machine")
//public class VendingMachine
//{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "item_number")
//    private int itemNumber;
//
////    @NotNull
////    @OneToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "fk_product_id")
////    private Product product;
//
//    @NotNull
//    @Column(name = "quantity")
//    private int quantity;
//
//    @NotNull
//    @Column(name = "seller_id")
//    private String sellerId;
//
//    public int getItemNumber() {
//        return itemNumber;
//    }
//
////    public String getProductId() {
////        return productId;
////    }
////
////    public void setProductId(String productId) {
////        this.productId = productId;
////    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public String getSellerId() {
//        return sellerId;
//    }
//
//    public void setSellerId(String sellerId) {
//        this.sellerId = sellerId;
//    }
//}
