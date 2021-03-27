package com.javams;

public class Floor {
    private String color;
    private int width;
    private int length;
    private Table table;


    public Floor(String color, int width, int length, Table table) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.table = table;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Table getTable() {
        System.out.println("Podoshel k stolu");
        return table;
    }

    public void cleanTheFloor(){
        System.out.println("Moem pol");
    }

    public void getArea(){
        System.out.println("floor area is : "+this.length*this.width);
    }
}
