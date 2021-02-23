package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double circleArea = AreaCalculator.area(5);
        double rectArea = AreaCalculator.area(2,4);
        System.out.println("Circle area is equals to " + circleArea);
        System.out.println("Rectangular are is equals to " + rectArea);
    }
}
