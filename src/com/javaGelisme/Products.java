package com.javaGelisme;

import java.util.Scanner;

public class Products {
    Scanner scan = new Scanner(System.in);
    private int unitPrice;
    private int DiscountRate;
    private int amountOfStock;
    private String productName;
    private int id;
    public Marka marka;


    public Products(int unitPrice, int discountRate, int amountOfStock, String productName, int id) {
        this.unitPrice = unitPrice;
        this.DiscountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.id = id;
    }



    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(int discountRate) {
        DiscountRate = discountRate;
    }

    public int getAmountOfStock() {
        return amountOfStock;
    }

    public void setAmountOfStock(int amountOfStock) {
        this.amountOfStock = amountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
