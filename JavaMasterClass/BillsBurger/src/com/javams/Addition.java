package com.javams;

public class Addition {
    private int price;
    private String name;

    public Addition(int price, String name) {
        System.out.println(getClass().getSimpleName()+" addition was added.");
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void describe(){
        System.out.println("- includes "+getClass().getSimpleName().toLowerCase()+"| price -> "+this.price+"$");
    }
}

