package com.javaGelisme;

public class Display {

    public static void displayOptions(){
        System.out.println("-----------------------");
        System.out.println("1- ürün eklemek ");
        System.out.println("2- ürün silmek ");
        System.out.println("3- ürünleri listelemek");
        System.out.println("4- Çıkış Yap");

    }

    public static void displayProductType(){
        System.out.println("-----------------------");
        System.out.println("1- Telefon ürün seçimi");
        System.out.println("2- Notebook ürün seçimi");
        System.out.println("3- Çıkş Yap");
    }
    
    public static void displayAllProduct(){
        //System.out.println("Id" + "\tMarka" + "\tProduct name" + "Price" + "\tRate" + "\tStock");
        System.out.format("%s | %8s | %8s | %8s | %8s | %8s | %8s\n", "ID", "Product type","Marka", "Product name", "Price", "Rate", "Stock");

    }
}
