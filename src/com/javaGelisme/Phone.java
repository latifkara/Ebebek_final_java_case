package com.javaGelisme;

import java.util.HashMap;

public class Phone extends Products{
    private String[] memoryInformation = {"64 GB", "128 GB"};
    private String[] color = {"Siyah", "Kırmızı", "Mavi"};
    private final String screenSize = "6.1 Inc";
    private final String batteryPower = "4000";
    private final String ram = "6 MB";
    private static HashMap<String, String> hashMap = new HashMap<>();

    public Phone(int unitPrice, int discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
        hashMap.put("memoryInformation", "64 GB - 128 GB");
        hashMap.put("color", "Siyah-Kırmızı-Mavi");
        hashMap.put("screenSize", "6.1 Inc");
        hashMap.put("batteryPower", "4000");
        hashMap.put("ram", "6 MB");
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getBatteryPower() {
        return batteryPower;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public HashMap<String, String> getHashMap() {
        return hashMap;
    }
}
