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

        int myIntValue = 5/3;
        float myFloatValue = (float) 5.25/3f;
        double myDoubleValue = 5.25/3f;

        System.out.println("INT = "+myIntValue+" FLOAT = "+myFloatValue+" DOUBLE = "+myDoubleValue);


        // challenge for float and double. We will confer pounds to kilograms:

        double kilograms;
        double onePoundToKilo = 0.45359237;
        int pounds = 180;

        kilograms = pounds*onePoundToKilo;
        System.out.println(pounds+" pounds is equal to "+ kilograms+ " kilograms");

        double oneKiloToPound;
        oneKiloToPound = pounds/kilograms;
        System.out.println("One kilogram is equal to "+ oneKiloToPound + " pounds");

        System.out.println("So if my weight is 125 killograms which is equal to "+ 125*oneKiloToPound + " pounds.");


    }
}
