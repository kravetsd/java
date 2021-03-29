package com.javams;

public class Cheese extends Addition {
    public Cheese(int price, String name) {
        super(price, name);
    }
}
/*
public class Cheese {
    private int price;
    private String name;

    public Cheese() {
        this.price = 2;
        this.name = getClass().getSimpleName();
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
*/
