package com.javaGelisme;

import java.util.HashMap;

public class Notebook extends Products{


    public Notebook(Double unitPrice, Double discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType,
                id, marka, "-", "-", "14 Inc",
                "-", "6 GB", "512 SSD", null);

    }



}
