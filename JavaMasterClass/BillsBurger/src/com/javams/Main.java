package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger(10,"white",true);

        Tomato tomato = new Tomato(5,"tomato");
        hamburger.addAddition(tomato);
        hamburger.describeBurger();
    }
}
