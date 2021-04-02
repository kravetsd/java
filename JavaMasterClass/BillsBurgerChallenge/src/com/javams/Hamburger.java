package com.javams;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;

    private double price;

    //additions:
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat,double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name,double price) {
        this.addition1Name = addition1Name;
        this.addition1Price = price;
        System.out.println("Added extra "+this.addition1Name+" for "+this.addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name,double price) {
        this.addition2Name = addition2Name;
        this.addition2Price = price;
        System.out.println("Added extra "+this.addition2Name+" for "+this.addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name,double price) {
        this.addition3Name = addition3Name;
        this.addition3Price = price;
        System.out.println("Added extra "+this.addition3Name+" for "+this.addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name,double price) {
        this.addition4Name = addition4Name;
        this.addition4Price = price;
        System.out.println("Added extra "+this.addition4Name+" for "+this.addition4Price);
    }

    public double itemizeHamburger(){
        if (this.addition1Name!=null){
            this.price+=this.addition1Price;
        }
        if (this.addition2Name!=null){
            this.price+=this.addition2Price;
        }
        if (this.addition3Name!=null){
            this.price+=this.addition3Price;
        }
        if (this.addition4Name!=null){
            this.price+=this.addition4Price;
        }
        return this.price;

    }
}
