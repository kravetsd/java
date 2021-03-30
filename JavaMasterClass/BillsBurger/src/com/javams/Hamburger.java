package com.javams;

public class Hamburger {
    private int price;
    private int additions;
    private int additionsLimit;

    private String breadRollType;
    private boolean meat;

    private Addition lettuce;
    private Addition tomato;
    private Addition carrot;
    private Addition cheese;

    public Hamburger(int price, String breadRollType, boolean meat) {
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = meat;

        this.carrot = null;
        this.cheese = null;
        this.tomato = null;
        this.lettuce = null;

        this.additionsLimit =4;
        this.additions = 0;
    }

    public int getAdditions() {
        return additions;
    }

    public void incrementAddition(){
        this.additions+=1;
    }

    public void incrementPrice(int price){
        this.price += price;
    }
    public int getPrice() {
        return price;
    }

    public int getAdditionsLimit() {
        return additionsLimit;
    }

    public void setAdditionsLimit(int additionsLimit) {
        this.additionsLimit = additionsLimit;
    }

    public Addition getLettuce() {
        return lettuce;
    }

    public Addition getCarrot() {
        return carrot;
    }

    public Addition getCheese() {
        return cheese;
    }

    public Addition getTomato() {
        return tomato;
    }

    public void addAddition(Addition addition){
        switch (addition.getName().toLowerCase()){
            case "cheese":
                if (this.additions < additionsLimit) {
                    this.cheese = addition;
                    incrementPrice(addition.getPrice());
                    incrementAddition();
                    System.out.println(addition.getClass().getSimpleName() + " addition was added.");
                    break;
                } else {
                    System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
                }
            case "tomato":
                if (this.additions < additionsLimit) {
                    this.tomato = addition;
                    incrementPrice(addition.getPrice());
                    incrementAddition();
                    System.out.println(addition.getClass().getSimpleName() + " addition was added.");
                    break;
                } else {
                    System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
                }
            case "lettuce":
                if (this.additions < additionsLimit) {
                    this.lettuce = addition;
                    incrementPrice(addition.getPrice());
                    incrementAddition();
                    System.out.println(addition.getClass().getSimpleName() + " addition was added.");
                    break;
                } else {
                    System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
                }
            case "carrot":
                if (this.additions < additionsLimit) {
                    this.carrot = addition;
                    incrementPrice(addition.getPrice());
                    incrementAddition();
                    System.out.println(addition.getClass().getSimpleName() + " addition was added.");
                    break;
                } else {
                    System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
                }
            default:
                System.out.println("Sorry, Unknown addition can't be added. ");
            }
    }

/*
    public void addCheese(){
        if (this.additions < additionsLimit) {
            this.cheese = new Cheese();
            this.price+= cheese.getPrice();
            this.additions += 1;
        } else {
            System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
        }
    }

    public void addTomato(){
        if (this.additions < additionsLimit) {
            this.tomato = new Tomato();
            this.price+= tomato.getPrice();
            this.additions += 1;
        } else {
            System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
        }
    }

    public void addCarrot(){
        if (this.additions < additionsLimit) {
            this.carrot = new Carrot();
            this.price+= carrot.getPrice();
            this.additions += 1;
        } else {
            System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
        }
    }

    public void addLettuce(){
        if (this.additions < additionsLimit) {
            this.lettuce = new Lettuce();
            this.price+= lettuce.getPrice();
            this.additions += 1;
        } else {
            System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
        }
    }
*/

    public void describeBurger(){
        if (getCheese() != null){
            getCheese().describe();
        }
        if (getTomato() != null){
            getTomato().describe();
        }
        if (getCarrot() != null){
            getCarrot().describe();
        }
        if (getLettuce() != null){
            getLettuce().describe();
        }
        System.out.println("Total price is : "+this.price);
    }
}
