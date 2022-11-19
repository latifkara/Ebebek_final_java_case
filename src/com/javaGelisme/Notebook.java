package com.javaGelisme;

public class Notebook extends Products{
    private final int ram = 6;
    private final int storage = 512;
    private final int screenSize = 14;

    public Notebook(int unitPrice, int discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
    }
}
