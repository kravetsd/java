package com.javams;

public class Tomato extends Addition {
    public Tomato(int price, String name) {
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
