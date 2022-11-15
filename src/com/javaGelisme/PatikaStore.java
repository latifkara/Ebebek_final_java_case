package com.javaGelisme;

public class PatikaStore {
    private static Marka[] markas;
    private static String[] markaName;

    public PatikaStore() {
        markaName = new String[]{"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
    }

    public static Marka[] getMarkas() {
        return markas;
    }

    public static void setMarkas(Marka[] markas) {
        PatikaStore.markas = markas;
    }

    static {
        markas = new Marka[markaName.length];
        for (int i = 0; i < markaName.length; i++) {
            markas[i] = new Marka((i+1), markaName[i]);
        }
    }

    public void run(){

    }



}
