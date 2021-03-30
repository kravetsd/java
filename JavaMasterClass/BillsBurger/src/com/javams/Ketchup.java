package com.javams;

public class Ketchup extends Addition {
    public Ketchup(int price, String name) {
        super(price, name);
    }
}
/*
public class Tomato {
    private int price;
    private String name;

    public Tomato() {
        this.price = 1;
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
