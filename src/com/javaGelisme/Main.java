package com.javaGelisme;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (Marka marka: Marka.getSortedMarka()) {
            System.out.println(marka.name);
        }


    }
}
