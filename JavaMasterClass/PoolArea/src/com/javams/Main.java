package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle(3,4);

        Cuboid cuboid = new Cuboid(rectangle.getWidth(),rectangle.getLength(),10);

        System.out.println("The area of Rectanle is "+rectangle.getArea());
        System.out.println(cuboid.getVolume());

        Cuboid cuboid1 = new Cuboid(5,10,5);
        System.out.println("The volume of cuboid1 is "+cuboid1.getVolume());
        System.out.println("the area of squared basis of cuboid1 is "+cuboid1.getArea());
    }
}
