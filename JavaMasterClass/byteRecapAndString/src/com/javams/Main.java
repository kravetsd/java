package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to : "+myString);
        myString = myString + " and more";
        System.out.println("myString is equal to : "+myString);
        myString = myString + ". \u00A9 2019";
        System.out.println("myString is equal to : "+myString);

        String numberString = "250,55";
        numberString = numberString + "49.55";
        System.out.println(numberString);

        int myInt = 50;
        String lastString = "50";
        lastString = lastString + myInt;
        System.out.println(lastString);


        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
}
