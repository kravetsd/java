package com.javams;

public class Car extends Vehicle{
    private int wheels;
    private String color;
    private int doors;

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }


    public Car(int wheels, int doors, String color){
        super("land",1000,"large",1);
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
    }

    public void switchGear(String gear, int speed){
        System.out.println("Car.switchGear() called. Car switched to "+gear+" gear");
        if (gear.equals("P")){
            System.out.println("Car is parked.");
        } else {
            axelerate(speed);
        }
    }

    public void axelerate(int speed){
        System.out.println("Car.axelerate() called. Car is axelerating!");
    }

    @Override
    public void move(int speed) {
        switchGear("D",speed);
        System.out.println("Car.move() called. Car is moving with speed "+speed+"km/h");
        super.move(speed);
    }

    public void turnDrivingWheel(String turn){
        System.out.println("Car.turnDrivingWheel() called. Turning whell to "+turn+ " turn.");
        turn(turn);
    }

    @Override
    public void turn(String turn) {
        System.out.println("Car.turn() called. Car is turing to "+turn+" turn.");
        super.turn(turn);
    }
}
