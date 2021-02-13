package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Max Float Value is = " + myMaxFloatValue);
        System.out.println("Min Float Value is = " + myMinFloatValue);

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Max Double Value is = " + myMaxDoubleValue);
        System.out.println("Min Double Value is = " + myMinDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25;

        System.out.println("INT = "+myIntValue+" FLOAT = "+myFloatValue+" DOUBLE = "+myDoubleValue);
    }
}
