package com.javaGelisme;

public class Marka {
    public int id;
    public String name;

    public Marka(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static class Samsung extends Marka {

        public Samsung(int id, String name) {
            super(id, name);
        }
    }
    public static class Lenovo extends Marka {

        public Lenovo(int id, String name) {
            super(id, name);
        }
    }
    public static class Apple extends Marka {

        public Apple(int id, String name) {
            super(id, name);
        }
    }
    public static class Huawei extends Marka {

        public Huawei(int id, String name) {
            super(id, name);
        }
    }
    public static class Casper extends Marka {

        public Casper(int id, String name) {
            super(id, name);
        }
    }
    public static class Asus extends Marka {

        public Asus(int id, String name) {
            super(id, name);
        }
    }
    public static class HP extends Marka {

        public HP(int id, String name) {
            super(id, name);
        }
    }
    public static class Xiaomi extends Marka {

        public Xiaomi(int id, String name) {
            super(id, name);
        }
    }
    public static class Monster extends Marka {

        public Monster(int id, String name) {
            super(id, name);
        }
    }

}


