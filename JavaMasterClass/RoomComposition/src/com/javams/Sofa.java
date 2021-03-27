package com.javams;

public class Sofa {
    private String size;
    private String color;

    public Sofa(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public void lieOnTheSofa(){
        System.out.println("Leg na divan");
    }
    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
