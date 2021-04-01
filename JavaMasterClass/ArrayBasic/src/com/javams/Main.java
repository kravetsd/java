package com.javams;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        //System.out.println("Please add a number :");
        //int [] intArray = getIntegers(5);

        int [] intArray = getIntegersFromTerminal(5);
        printArray(intArray);
        System.out.println("An average is : "+getAverage(intArray));
    }
    public static double[] getIntegers(int count){
        double[] myarr = new double[count];
        for (int i=0; i<count; i++){
            myarr[i] = i*5;
        }
        scanner.close();
        return myarr;
    }

    public static double getAverage(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return (double) sum/array.length;
    }

    public static int[] getIntegersFromTerminal(int number){
        System.out.println("Please, enter "+number+" values to form an array :");
        int[] myarr = new int[number];
        for (int i=0; i<number; i++){
            myarr[i] = scanner.nextInt();
        }
        return myarr;

    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
