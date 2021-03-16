package com.javacompletereference;

public class BasicConstructors {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.customizeCar("green");
        mycar.desctibeCar();

        Car newCar = new Car(4,2,"Porshe","red");

        newCar.desctibeCar();

    }
}

class Car{
    private int wheels;
    private int doors;
    private String model;
    private String color;

    Car(int wheels,int doors, String model, String color){
        System.out.println("Constructing your new car from scratch....");
        this.wheels = wheels;
        this.doors = doors;
        this.model = model;
        this.color = color;
    }
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
                "The model is -"+ this.model+"! Congrats!");
    }
}
