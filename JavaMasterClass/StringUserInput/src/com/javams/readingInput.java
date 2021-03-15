package com.javams;

import java.util.Scanner;

public class readingInput {
    public static int readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is is now?");
        int time = scanner.nextInt();
        scanner.nextLine(); // handling next line character
        System.out.println("Please enter your name here:");

        String name = scanner.nextLine();
        System.out.println("Hi, "+name+"!");
        System.out.println("Please enter the number to draw a star diagonal:  ");
        int num = scanner.nextInt();

        System.out.println("Please enter your year of birth:");
        if (!scanner.hasNextInt()){
            System.out.println("Unable to parse your year of birth");
            return -1;
        }
        int yearOfBirth = scanner.nextInt();
        int yourAge = 2021-yearOfBirth;
        System.out.println("Your age is "+yourAge);


        scanner.close();
        System.out.println("Here is a diagonal for a number of : "+ num);
        return num;

    }
}
