package com.javaGelisme;

import java.util.HashMap;
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
    private String memoryInformation;
    private String color;
    private String screenSize;
    private String batteryPower;
    private String ram;
    private String storage;

    private  HashMap<String, String> hashMap = new HashMap<>();


    public Products(int unitPrice, int discountRate, int amountOfStock, String productName,
                    String productType, int id, Marka marka, String memoryInformation, String color,
                    String screenSize, String batteryPower, String ram, String storage, HashMap hashMap) {
        this.unitPrice = unitPrice;
        this.DiscountRate = discountRate;
        this.amountOfStock = amountOfStock;
        this.productName = productName;
        this.productType = productType;
        this.id = id;
        this.marka = marka;
        this.memoryInformation = memoryInformation;
        this.color = color;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.storage = storage;
        this.hashMap = hashMap;
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

    public  HashMap<String, String> getHashMap() {
        return hashMap;
    }

    public String getMemoryInformation() {
        return memoryInformation;
    }

    public void setMemoryInformation(String memoryInformation) {
        this.memoryInformation = memoryInformation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(String batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
}
