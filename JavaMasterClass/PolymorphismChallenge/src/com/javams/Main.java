package com.javams;


class Car{
    private boolean engine;
    private String name;
    private int wheels;
    private int doors;
    private int cylinders;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.doors = 5;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Car -> Engine started.";
    }

    public String accelerate(){
        return "Car -> is accelerating.";
    }

    public String brake(){
        return "Car -> is braking.";
    }

    public boolean getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class KiaRio extends Car{
    public KiaRio(String name, int cylinders) {
        super(name, cylinders);
    }
    public String startEngine(){
        return "KiaRio -> "+this.getName()+" -> Engine started.";
    }

    public String accelerate(){
        return "KiaRio -> "+this.getName()+" is accelerating.";
    }

    public String brake(){
        return "KiaRio -> "+this.getName()+" is braking.";
    }
}

class Polo extends Car{
    public Polo(String name, int cylinders) {
        super(name, cylinders);
    }
    public String startEngine(){
        return "Polo -> "+this.getName()+" -> Engine started.";
    }

    public String accelerate(){
        return "Polo -> "+this.getName()+" is accelerating.";
    }

    public String brake(){
        return "Polo -> "+this.getName()+" is braking.";
    }
}

class Solaris extends Car{
    public Solaris(String name, int cylinders) {
        super(name, cylinders);
    }
    public String startEngine(){
        return "Solaris -> "+this.getName()+" -> Engine started.";
    }

    public String accelerate(){
        return "Solaris -> "+this.getName()+" is accelerating.";
    }

    public String brake(){
        return "Solaris -> "+this.getName()+" is braking.";
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 11; i++) {
            Car randomCar = randomCar();
            System.out.println("Car owner is "+randomCar.getName()+"\n " +
                    randomCar.startEngine()+"\n"+
                    randomCar.accelerate()+"\n"+
                    randomCar.brake()+"\n");
        }
    }

        public static Car randomCar () {
            int randomNumber = (int) (Math.random() * 3 + 1);
            System.out.println("Random number was defined as : " + randomNumber);
            switch (randomNumber) {
                case 1:
                    return new KiaRio("Dima", 8);
                case 2:
                    return new Polo("Artem", 6);
                case 3:
                    return new Solaris("Julia", 5);
            }
            return null;
        }
}
