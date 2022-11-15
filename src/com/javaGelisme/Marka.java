package com.javaGelisme;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;

public class Marka {
    public int id;
    public String name;
    private static Marka[] markas;

    public Marka(int id, String name) {
        this.id = id;
        this.name = name;

    }

    static {
        markas = new Marka[9];
        markas[0] = new Marka(1, "Samsung");
        markas[1] = new Marka(2, "Lenovo");
        markas[2] = new Marka(3, "Apple");
        markas[3] = new Marka(4, "Huawei");
        markas[4] = new Marka(5, "Casper");
        markas[5] = new Marka(6, "Asus");
        markas[6] = new Marka(7, "HP");
        markas[7] = new Marka(8, "Xiaomi");
        markas[8] = new Marka(9, "Monster");
    }

    public static Marka[] getMarkas() {
        return markas;
    }

    public static Marka[] getSortedMarka(){
        Arrays.sort(getMarkas(), Collections.reverseOrder());
        return getMarkas();
    }
}


