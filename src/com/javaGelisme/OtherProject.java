package com.javaGelisme;

import java.util.HashMap;
import java.util.List;

public class OtherProject extends Products {
    private HashMap<String, String> hashMap = new HashMap<>();
    public OtherProject(int unitPrice, int discountRate, int amountOfStock, String productName, String productType, int id, Marka marka,HashMap hashMap) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
        this.hashMap = hashMap;
    }

    @Override
    public HashMap<String, String> getHashMap() {
        return hashMap;
    }
}
