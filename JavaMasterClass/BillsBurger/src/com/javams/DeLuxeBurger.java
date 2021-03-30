package com.javams;

public class DeLuxeBurger extends Hamburger {
    private boolean chips;
    private boolean drink;

    public DeLuxeBurger(int price, String breadRollType, boolean meat) {
        super(price, breadRollType, meat);
        this.chips = true;
        this.drink = true;
        super.setAdditionsLimit(0);
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    @Override
    public void addAddition(Addition addition) {
        System.out.println("No extra additions can be added to Deluxe Burger.");
    }

    @Override
    public void describeBurger() {
        if (isChips()){
            System.out.println("- includes chips ");
        }
        if (isDrink()){
            System.out.println("- includes drink ");
        }
        super.describeBurger();
    }
}
