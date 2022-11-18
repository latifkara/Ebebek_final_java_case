package com.javaGelisme;
import java.util.Collections;
import java.util.List;

public class Marka {
    private int id;
    private String name;
    private static Marka[] markas;
    private static String[] markaName;


    public Marka(int id, String name) {
        this.id = id;
        this.name = name;

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


