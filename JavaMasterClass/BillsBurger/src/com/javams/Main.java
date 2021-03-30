package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger(10,"white",true);

        Tomato tomato = new Tomato(5,"tomato");
        Carrot carrot = new Carrot(2,"carrot");
        Lettuce lettuce = new Lettuce(4,"lettuce");
        Cheese cheese = new Cheese(6,"cheese");

        hamburger.addAddition(tomato);
        hamburger.addAddition(carrot);
        hamburger.addAddition(lettuce);
        hamburger.addAddition(cheese);
        hamburger.describeBurger();

    }
}
