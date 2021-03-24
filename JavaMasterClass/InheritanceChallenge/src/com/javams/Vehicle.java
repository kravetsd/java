package com.javams;

public class Vehicle {
    private int weight;
    private String type;
    private String size;
    private int age;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(int speed){
        if (speed==0){
            System.out.println("Car is stopping");
        } else {
            System.out.println("Vehicle.move() called. Vehicle is moving with speed " + speed + " km/h");
        }
    }

    public void turn(String turn){
        System.out.println("Vehicle.turn() called. Vehicle turned to the "+turn);
    }

    public Vehicle(String type, int weight, String size, int age){
        this.type = type;
        this.weight = weight;
        this.size = size;
        this.age = age;
    }
}
