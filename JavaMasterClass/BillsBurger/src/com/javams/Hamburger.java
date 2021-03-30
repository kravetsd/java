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
        if (this.additions < additionsLimit) {
            switch (addition.getName().toLowerCase()){
                case "cheese":
                    this.cheese = addition;
                    this.price+= addition.getPrice();
                    this.additions += 1;
                    System.out.println(addition.getClass().getSimpleName()+" addition was added.");
                    break;
                case "tomato":
                    this.tomato = addition;
                    this.price+= addition.getPrice();
                    this.additions += 1;
                    System.out.println(addition.getClass().getSimpleName()+" addition was added.");
                    break;
                case "lettuce":
                    this.lettuce = addition;
                    this.price+= addition.getPrice();
                    this.additions += 1;
                    System.out.println(addition.getClass().getSimpleName()+" addition was added.");
                    break;
                case "carrot":
                    this.carrot = addition;
                    this.price+= addition.getPrice();
                    this.additions += 1;
                    System.out.println(addition.getClass().getSimpleName()+" addition was added.");
                    break;
                default:
                    System.out.println("Sorry, Unknown addition can't be added. ");
            }
        } else {
            System.out.println(getClass().getSimpleName()+" can't have more then "+additionsLimit+" of addtions ");
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
