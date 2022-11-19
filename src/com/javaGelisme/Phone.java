package com.javaGelisme;

public class Phone extends Products{
    private String[] memoryInformation = {"64 GB", "128 GB"};
    private String[] color = {"Siyah", "Kırmızı", "Mavi"};
    private final String screenSize = "6.1 Inc";
    private final String batteryPower = "4000";
    private final String ram = "6 MB";

    public Phone(int unitPrice, int discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
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
}
