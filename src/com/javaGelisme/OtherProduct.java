package com.javaGelisme;

import java.util.HashMap;

public class OtherProduct extends Products {
    public OtherProduct(Double unitPrice, Double discountRate, int amountOfStock, String productName, String productType, int id, Marka marka, HashMap hashMap) {
        super(unitPrice, discountRate, amountOfStock, productName, productType,
                id, marka, "-", "-", "-",
                "-", "-", "-", hashMap);
    }

}
