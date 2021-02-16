package com.javams;

public class Main {

    public static void main(String[] args) {
        int int2 = 5;
        // false, true, null - are also reserved word

        // a mile is equals to 1.609344 kilometers

        double kilometers = 100 * 1.609344; // this is a valid java statement consisting of expression and data type with ;

        int highScore = 50;


        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //------------------ Statement and indentation-------
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test of the statment above. and it is equal to " + myVariable);

        System.out.println("This is a start of the statment " + //this plus sign is required here.
                "this is more for this statement " +
                "this is another line of the valid statement. ");

        int anotherVar = 50;
        myVariable--; // this is also valid statements on the same line. DON'T do so.
        int myVal = 12;
        System.out.println("this is a statement");

        int someInt
                =
                6324;  // This is also not a mistake
        System.out.println(someInt);


        //----- Codeblocks in JAVA ----- is next//
    }
}
