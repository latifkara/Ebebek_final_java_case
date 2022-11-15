package com.javaGelisme;

import javafx.print.Collation;

import java.util.Arrays;
import java.util.Collections;

public class Marka {
    private int id;
    private String name;
    private static Marka[] markas;
    private static String[] markaName;

    public Marka(int id, String name) {
        this.id = id;
        this.name = name;

    }


    public static Marka[] getSortedMarka(){
        PatikaStore patikaStore = new PatikaStore();
        Arrays.sort(patikaStore.getMarkas(), Collections.reverseOrder());
        return patikaStore.getMarkas();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


