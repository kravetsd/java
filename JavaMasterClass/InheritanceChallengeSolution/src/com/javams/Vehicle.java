package com.javams;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int getCurrentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity=0;
        this.getCurrentDirection=0;
    }

    public void steer(int direction){
        this.getCurrentDirection+=direction;
        System.out.println("Vehicle.steer() : steering at "+direction+" degree.");
    }

    public void move(int velocity, int direction){
        this.currentVelocity+=velocity;
        this.getCurrentDirection+=direction;

        System.out.println("Vehicle.move() Moving at "+currentVelocity+" in direction "+getCurrentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getGetCurrentDirection() {
        return getCurrentDirection;
    }

    public void setGetCurrentDirection(int getCurrentDirection) {
        this.getCurrentDirection = getCurrentDirection;
    }
}
