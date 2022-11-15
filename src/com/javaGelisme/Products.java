package com.javaGelisme;

public abstract class Products {
    private int unitPrice;
    private int DiscountRate;
    private int amountOfStock;
    private String productName;
    private int id;
    private int[] memoryInformation = {64, 128};
    private String[] color = {"Siyah", "Kırmızı", "Mavi"};
    public Marka marka;
    private final double screenSize = 6.1;
    private final int batteryPower = 4000;
    private final int ram = 6;


    public Products(int unitPrice, int discountRate, int amountOfStock, String productName, int id) {
        this.unitPrice = unitPrice;
        DiscountRate = discountRate;
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
