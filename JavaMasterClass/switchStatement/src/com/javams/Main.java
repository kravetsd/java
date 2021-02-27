package com.javams;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Value was 1 ");
                break;
            case 2: case 4: case 6:
                System.out.println("Value was 2 or 4 or 6");
                System.out.println("But actually it was "+value);
                break;
            default:
                System.out.println("Value was neither 1 nor 2");
                break;
        }

        char charVal = 'E';
        switch (charVal){
            case 'A':
                System.out.println("'A' was found");
                break;
            case 'B':
                System.out.println("'B' was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charVal + " was found");
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan month is coming");
                break;
            case "June":
                System.out.println("Jun month is coming");
                break;
            default:
                System.out.println("I am not sure which month is it");
                break;
        }
    }
}
