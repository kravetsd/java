package com.javams;

public class Table {
    private String color;
    private String material;
    private String size;

    public Table(String color, String material, String size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }
    public void mooveTavle(){
        System.out.println("moving table");
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
