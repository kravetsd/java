package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger(10,"white",true);
        HealthyBurger healthyBurger = new HealthyBurger(10,true);

        Tomato tomato = new Tomato(5,"tomato");
        Carrot carrot = new Carrot(2,"carrot");
        Lettuce lettuce = new Lettuce(4,"lettuce");
        Cheese cheese = new Cheese(6,"cheese");

        Onion onion = new Onion(3,"onion");
        Ketchup ketchup = new Ketchup(6,"ketchup");

        hamburger.addAddition(tomato);
        hamburger.addAddition(carrot);
        hamburger.addAddition(lettuce);
        hamburger.addAddition(cheese);
        hamburger.describeBurger();

        System.out.println("-----------------------------");

        healthyBurger.addAddition(tomato);
        healthyBurger.addAddition(carrot);
        healthyBurger.addAddition(lettuce);
        healthyBurger.addAddition(cheese);
        healthyBurger.addAddition(ketchup);
        healthyBurger.addAddition(onion);
        healthyBurger.describeBurger();

    }
}
