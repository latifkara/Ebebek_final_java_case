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
        System.out.println("1- Telefon ürün ekleme");
        System.out.println("2- Notebook ürün ekleme");
        System.out.println("3- Farklı bir ürün ekleme");
        System.out.println("4- Çıkş Yap");
    }
    
    public static void displayAllProduct(){
        //System.out.println("Id" + "\tMarka" + "\tProduct name" + "Price" + "\tRate" + "\tStock");
        System.out.format("%s | %8s | %6s | %8s | %8s | %8s | %8s\n", "ID", "Product type","Marka", "Product name", "Price", "Rate", "Stock");

    }
}
