package com.javaGelisme;

import java.util.HashMap;

public class OtherProject extends Products {
    private HashMap<String, String> hashMap = new HashMap<>();
    public OtherProject(int unitPrice, int discountRate, int amountOfStock, String productName, String productType, int id, Marka marka,HashMap hashMap) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka, hashMap);
        this.hashMap = hashMap;
    }

}
