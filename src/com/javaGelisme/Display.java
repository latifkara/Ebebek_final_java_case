package com.javaGelisme;

import java.util.HashMap;
import java.util.List;

public class Display {

    public static void displayOptions(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1- ürün eklemek ");
        System.out.println("2- ürün silmek ");
        System.out.println("3- ürünleri listelemek");
        System.out.println("4- Çıkış Yap");

    }

    public static void displayProductType(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("1- Telefon ürün ekleme");
        System.out.println("2- Notebook ürün ekleme");
        System.out.println("3- Farklı bir ürün ekleme");
        System.out.println("4- Çıkş Yap");
    }
    
    public static void displayAllProduct(HashMap hashMap){
        String[] skillName = {"ID", "Product type","Marka", "Product name", "Price", "Rate", "Stock","hafıza bilgisi",
                "RAM storage", "Screen size", "Storage", "color", "Battery Power"};
        System.out.format("%s | %8s | %6s | %8s | %8s | %8s | %8s | %6s | %12s | %8s | %8s | %12s | %8s",
                "ID", "Product type","Marka", "Product name", "Price", "Rate", "Stock","hafıza bilgisi",
                "RAM storage", "Screen size", "Storage", "color", "Battery Power");

        if (hashMap != null) {
            hashMap.forEach((key, value) -> {
                    if (checkProductName(key.toString(), skillName)){
                        System.out.format("| %8s |", key);
                    }
            });
        }

        System.out.println();
    }

    public static boolean checkProductName(String key, String[] skillList){
        for (String name: skillList){
            if (name == key){
                return false;
            }
        }
        return true;
    }
}
