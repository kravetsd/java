package com.javams;

public class HealthyBurger extends Hamburger {

    private Addition onion;
    private Addition ketchup;

    public HealthyBurger(int price, boolean meat) {
        super(price, "brown rye bread" , meat);
        super.setAdditionsLimit(6);
    }

    public Addition getOnion() {
        return onion;
    }

    public Addition getKetchup() {
        return ketchup;
    }

    @Override
    public void addAddition(Addition addition) {
        switch (addition.getName().toLowerCase()) {
            case "onion":
                if (getAdditions() < getAdditionsLimit()) {
                    this.onion = addition;
                    incrementPrice(addition.getPrice());
                    incrementAddition();
                    System.out.println(addition.getClass().getSimpleName() + " addition was added.");
                    break;
                } else {
                    System.out.println(getClass().getSimpleName() + " can't have more then " + getAdditionsLimit() + " of addtions ");
                }
            case "ketchup":
                if (getAdditions() < getAdditionsLimit()) {
                    this.ketchup = addition;
                    incrementPrice(addition.getPrice());
                    incrementAddition();
                    System.out.println(addition.getClass().getSimpleName() + " addition was added.");
                    break;
                } else {
                    System.out.println(getClass().getSimpleName() + " can't have more then " + getAdditionsLimit() + " of addtions ");
                }
            default:
                super.addAddition(addition);
        }
    }

    @Override
    public void describeBurger() {
        if (getOnion() != null){
            getOnion().describe();
        }
        if (getKetchup() != null){
            getKetchup().describe();
        }
        super.describeBurger();
    }
}
