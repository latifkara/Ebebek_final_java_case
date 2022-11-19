package com.javaGelisme;

import java.util.Scanner;

public class Products {
    Scanner scan = new Scanner(System.in);
    private int unitPrice;
    private int DiscountRate;
    private int amountOfStock;
    private String productName;
    private String productType;
    private int id;
    private Marka marka;


    public Products(int unitPrice, int discountRate, int amountOfStock, String productName, String productType, int id, Marka marka) {
        this.unitPrice = unitPrice;
        this.DiscountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.productType = productType;
        this.id = id;
        this.marka = marka;
    }


    public void printInfo(){
        System.out.println("id : " + this.getId() + "\tName : " + this.getProductName() + "\tPrice : " + this.getUnitPrice());
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

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
