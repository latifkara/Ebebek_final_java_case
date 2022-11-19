package com.javaGelisme;

public class Phone extends Products{
    private int[] memoryInformation = {64, 128};
    private String[] color = {"Siyah", "Kırmızı", "Mavi"};
    private final double screenSize = 6.1;
    private final int batteryPower = 4000;
    private final int ram = 6;

    public Phone(int unitPrice, int discountRate, int amountOfStock, String productName,String productType, int id, Marka marka) {
        super(unitPrice, discountRate, amountOfStock, productName, productType, id, marka);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public int getRam() {
        return ram;
    }
}
