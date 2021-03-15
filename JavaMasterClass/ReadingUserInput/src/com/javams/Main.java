package com.javams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // read 10 number from console
        // print sum of 10 numbers
        // use scanner class
        // use hasNextInt() to check if integer was provided
        // if hasnextint returns false - "Invalid Value"
        // continue until 10 numbers provided
        // use nextInt method to get each number and add it to the sum
        // "Enter numver #x: " where X is a count of the current number
        // while loop and counter
        // close scanner after you used it
        int counter=1;
        int total=0;
        // opening the scanner
        Scanner scanner = new Scanner(System.in);
        while (counter<=10){
            System.out.println("Enter number #"+counter+":");
            if (!scanner.hasNextInt()){
                System.out.println("Invalid Value");
            } else {
                int num = scanner.nextInt();
                total += num;
                counter++;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("sum is equal to "+total);
    }
}
