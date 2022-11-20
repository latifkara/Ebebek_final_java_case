package com.javaGelisme;

import java.util.*;

public class PatikaStore {
    int id = 0;
    private Scanner scan = new Scanner(System.in);
    private static TreeSet<Marka> markaList = new TreeSet<>((name1, name2) -> name1.getName().compareTo(name2.getName()));
    private static String[] markaNameList = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
    private List<Products> productsList = new ArrayList<>();
    private HashMap<String, String> hashMap;
    private Products productPhone;
    private Products productNotebook;
    private Products productOther;



    static {
        Arrays.sort(markaNameList);
        for (int i = 0; i < markaNameList.length; i++) {
            markaList.add(new Marka((i+1), markaNameList[i]));
        }
        System.out.println("------------------------Patika store'e Hoşgeldiniz------------------------");
        System.out.println();
        System.out.println("                Lüften aşağıdaki seçeneklerden birini seçiniz");
        System.out.println();
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
                    this.addProduct(++id, "Phone",productPhone);
                    //this.getProducts().printInfo();
                    break;
                case 2:
                    System.out.println("Notbook ürünü seçtiniz");
                    this.addProduct(++id, "Notebook", productNotebook);
                    break;
                case 3:
                    System.out.println("Diğer Ürünleri ekleyiniz");
                    System.out.print("Ürün türü ekleyiniz : ");
                    String productType = scan.next();
                    this.addProduct(++id, productType, productOther);
                    break;
                case 4:
                    isExit = false;
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");
            }
        }
        return true;
    }


    public void addProduct(int id,String productType, Products products){
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
            if (marka.getName().equalsIgnoreCase(markaName) && productType.equalsIgnoreCase("Phone")){
                this.setProductPhone(new Phone(unitePrice, rate, stock, productName, productType, id, marka));
                this.productsList.add(this.getProductPhone());
                System.out.println("Ürün eklendi");
            }else if (marka.getName().equalsIgnoreCase(markaName) && productType.equalsIgnoreCase("Notebook")){
                this.setProductNotebook(new Notebook(unitePrice, rate, stock, productName, productType, id, marka));
                this.productsList.add(this.getProductNotebook());
                System.out.println("Ürün eklendi");
            }else if (marka.getName().equalsIgnoreCase(markaName)){
                this.addSkillForOtherProducts();
                this.setProductOther(new OtherProject(unitePrice, rate, stock, productName, productType, id, marka, this.getHashMap()));
                this.productsList.add(this.getProductOther());
                System.out.println("Ürün eklendi");
            }
        }
    }
    public void addSkillForOtherProducts(){
        hashMap = new HashMap<>();
        while (true) {
            System.out.print("Yeni bir özellik eklemek ister misiniz: <E>vet veya <H>ayır --> ");
            String letter = scan.next();
            if (letter.equalsIgnoreCase("e")){
                System.out.print("Ürün özelliğini giriniz : ");
                String key = scan.next();
                System.out.print("Özellik değeri giriniz : ");
                String value = scan.next();
                hashMap.put(key, value);
            }else {
                break;
            }
        }

    }
    public void printProducts(){
        List<Products> newList = this.getSortedProductsList();
        Display.displayAllProduct(this.getHashMap());
        for (Products products : newList){
            System.out.format("%d %12s %10s %12s %12d %10d %8d %16s %14s %12s %12s %12s %12s",
                                products.getId(), products.getProductType(), products.getMarka().getName(),
                                products.getProductName(), products.getUnitPrice(), products.getDiscountRate(),
                                products.getAmountOfStock(), products.getMemoryInformation(), products.getRam(),
                                products.getScreenSize(), products.getStorage(), products.getColor(), products.getBatteryPower());

           if (products.getHashMap() != null){
               products.getHashMap().forEach((key, value) -> {
                   System.out.format(" %14s ", value);
               });
           }
            System.out.println();
        }

    }
    public List<Products> getSortedProductsList(){
        this.productsList.sort((obj1, obj2) -> obj1.getMarka().getName().compareTo(obj2.getMarka().getName()));
        for (int i = 0; i < this.productsList.size(); i++) {
            this.productsList.get(i).setId((i + 1));
        }
        return this.productsList;
    }




    public Products getProductPhone() {
        return productPhone;
    }

    public void setProductPhone(Products productPhone) {
        this.productPhone = productPhone;
    }

    public Products getProductNotebook() {
        return productNotebook;
    }

    public void setProductNotebook(Products productNotebook) {
        this.productNotebook = productNotebook;
    }

    public Products getProductOther() {
        return productOther;
    }

    public void setProductOther(Products productOther) {
        this.productOther = productOther;
    }

    public HashMap<String, String> getHashMap() {
        return hashMap;
    }

}
