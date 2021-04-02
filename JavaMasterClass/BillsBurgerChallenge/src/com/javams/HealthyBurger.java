package com.javams;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;

    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        System.out.println("Added extra "+this.healthyExtra1Name+" for "+this.healthyExtra1Price);
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
        System.out.println("Added extra "+this.healthyExtra2Name+" for "+this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        double extrahealthy = 0;
        if (this.healthyExtra1Name!=null){
            extrahealthy+=this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name!=null){
            extrahealthy+=this.healthyExtra2Price;
        }
        return extrahealthy+super.itemizeHamburger();
    }

    public HealthyBurger(String meat,double price) {
        super("Healthy", meat,price, "Some bread");
    }
}
