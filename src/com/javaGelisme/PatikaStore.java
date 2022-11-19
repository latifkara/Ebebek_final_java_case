package com.javaGelisme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatikaStore {
    private Scanner scan = new Scanner(System.in);
    private static List<Marka> markaList = new ArrayList<>();
    private static String[] markaNameList = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
    private Products products;
    private List<Products> productsList = new ArrayList<>();
    int id = 0;


    public static List<Marka> getMarkaList() {
        return markaList;
    }
    public static List<Marka> getSortedMarka(){
        getMarkaList().sort((obj1, obj2)
                -> obj1.getName().compareTo(obj2.getName())
        );
        return getMarkaList();
    }
    static {
        for (int i = 0; i < markaNameList.length; i++) {
            markaList.add(new Marka((i+1), markaNameList[i]));
        }
    }
    public void run(){
        this.selectEvent();
    }
    public void selectEvent(){
        int select = 0;
        Boolean isSelected = true;
        while (isSelected) {
            Display.displayOptions();
            System.out.print("Seçmek istediğiniz ürün türü giriniz : ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    this.addProduct();
                    break;
                case 2:
                    this.deleteProduct();
                    break;
                case 3:
                    this.printProducts();
                    break;
                case 4:
                    isSelected = false;
                    System.out.println("Tekrar Bekleriz.");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");

            }
        }
    }
    public Boolean deleteProduct(){
        System.out.print("Silmek istedğiniz ürün numarası giriniz : ");
        int removeItem = scan.nextInt();
        this.productsList.remove(--removeItem);
        for (int i=removeItem; i < this.productsList.size(); i++){
            this.productsList.get(i).setId(++removeItem);
        }
        id--;
        return false;
    }

    public Boolean addProduct()
    {
        boolean isExit = true;
        while (isExit) {
            Display.displayProductType();
            System.out.print("Lütfen ürün türü seçiniz : ");
            int select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Telefon ürünü seçtiniz");
                    this.addProduct(++id, products);
                    //this.getProducts().printInfo();
                    break;
                case 2:
                    System.out.println("Notbook ürünü seçtiniz");
                    break;
                case 3:
                    isExit = false;
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");
            }
        }
        return true;
    }
    public  List<Products> getSortedProduct(){
        this.productsList.sort((obj1, obj2)
                -> obj1.getProductName().compareTo(obj2.getProductName()));

        return productsList;
    }

    public void addProduct(int id, Products products){
        System.out.print("Marka ismi Giriniz : ");
        String markaName = scan.next();
        System.out.print("Ürün adı giriniz : ");
        String productName = scan.next();
        System.out.print("Birim fiyatını giriniz : ");
        int unitePrice = scan.nextInt();
        System.out.print("Indirim oranı giriniz : ");
        int rate = scan.nextInt();
        System.out.print("Stok miktarı giriniz : ");
        int stock = scan.nextInt();
        for (Marka marka:this.markaList) {
            if (marka.getName().equalsIgnoreCase(markaName)){
                this.setProducts(new Phone(unitePrice, rate, stock, productName, id, marka));
                this.productsList.add(this.getProducts());
            }
        }
    }

    public void printProducts(){
        Display.displayAllProduct();
        for (Products products : this.productsList){
            System.out.format("%d %10s %8s %10d %8d %8d\n", products.getId(), products.getMarka().getName(),
                                products.getProductName(), products.getUnitPrice(), products.getDiscountRate(),
                                products.getDiscountRate(), products.getAmountOfStock());
        }
    }


    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }


}
