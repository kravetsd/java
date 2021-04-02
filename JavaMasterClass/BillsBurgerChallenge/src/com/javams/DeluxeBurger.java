package com.javams;

public class DeluxeBurger extends Hamburger {

    private String addition1Name = "Chips";
    private double addition1Price = 0;
    private String addition2name = "Drink";
    private double addition2Price = 0;



    @Override
    public void addHamburgerAddition1(String addition1Name, double price) {
        System.out.println("No additions allowed for DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double price) {
        System.out.println("No additions allowed for DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double price) {
        System.out.println("No additions allowed for DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double price) {
        System.out.println("No additions allowed for DeluxeBurger");
    }

    public DeluxeBurger() {
        super("DeluxeBurger", "Sausage",19.10, "brown bread roll");


    }
}
