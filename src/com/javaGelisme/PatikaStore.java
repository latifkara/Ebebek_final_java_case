package com.javaGelisme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    private Scanner scan = new Scanner(System.in);
    private static List<Marka> markaList = new ArrayList<>();
    private static String[] markaName = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
    public Products products;

    public static List<Marka> getMarkaList() {
        return markaList;
    }


    static {
        for (int i = 0; i < markaName.length; i++) {
            markaList.add(new Marka((i+1), markaName[i]));
        }
    }

    public void run(){
        this.selectProduct();
        this.printInfo();

    }

    public Boolean selectProduct()
    {
        int id = 0;
        boolean isExit = true;
        while (isExit) {
            System.out.print("Lütfen ürün türü seçiniz : ");
            int select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Telefon ürünü seçtiniz");

                    this.addPhoneProduct(id++, products);
                    break;
                case 2:
                    System.out.println("Notbook ürünü seçtiniz");
                    break;
                case 3:
                    System.out.println("Tekrar bekleriz");
                    isExit = false;
                    break;
                default:
                    System.out.println("Yanlış seçiim yaptınız");
            }
        }
        return true;
    }

    public void addPhoneProduct(int id, Products products){
        System.out.print("Ürün adı giriniz : ");
        String productName = scan.next();
        System.out.print("Birim fiyatını giriniz : ");
        int unitePrice = scan.nextInt();
        System.out.print("Indirim oranı giriniz : ");
        int rate = scan.nextInt();
        System.out.print("Stok miktarı giriniz : ");
        int stock = scan.nextInt();
        products = new Phone(unitePrice, rate, stock, productName, id);
    }
    public void printInfo(){
        System.out.println("id : " + products.getId() + " Name : " + products.getProductName() + " Price : " + products.getUnitPrice());
    }



}
