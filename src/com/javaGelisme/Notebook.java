package com.javaGelisme;

import java.util.HashMap;

public class Notebook extends Products{
    private final String ram = "6 GB";
    private final String storage = "512 SSD";
    private final String screenSize = "14 inç";
    private HashMap<String, String> hashMap = new HashMap<>();

    public Notebook(int unitPrice, int discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
        hashMap.put("ram", "6 GB");
        hashMap.put("Storage", "512 SSD");
        hashMap.put("screenSize", "14 Inc");
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

    @Override
    public HashMap<String, String> getHashMap() {
        return hashMap;
    }
}
