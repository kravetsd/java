package com.javacompletereference;

public class BasicConstructors {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.customizeCar("green");
        mycar.desctibeCar();

    }
}

class Car{
    private int wheels;
    private int doors;
    private String model;
    private String color;

    Car(){
        System.out.println("Constructing a car");
        this.wheels = 4;
        this.doors = 4;
        this.model = "Volga";
    }

    private void setColor(String c){
        this.color = c;
    }

    public void customizeCar(String c){
        setColor(c);
        System.out.println("You made your car to be "+this.color);
    }

    public void desctibeCar(){
        System.out.println("Your new car has "+this.wheels+" wheels and "+this.doors+" doors. " +
                "The models is "+ this.model+"! Congrats!");
    }
}
