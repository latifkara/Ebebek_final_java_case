package com.javaGelisme;

public class Notebook extends Products{
    private final String ram = "6 GB";
    private final String storage = "512 SSD";
    private final String screenSize = "14 inç";

    public Notebook(int unitPrice, int discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreenSize() {
        return screenSize;
    }
}
