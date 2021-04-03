package com.javams;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayBasicChallenge {
    public static void main(String[] args) {
        // main method:
        System.out.println("Hi! this program prints a sorted array of integer values.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the size of the array to sort: ");
        int count = scanner1.nextInt();

        System.out.println("Please enter " + count + " integer numbers: ");
        int[] startArray = getIntegers(count);

        printArray(startArray);
        scanner1.close();

        System.out.println("Sorted array: ");
        printArray(sortIntegers(startArray));
    }

    private static Scanner scanner = new Scanner(System.in);


    public static int[] getIntegers(int size) {
        int[] startArray = new int[size];
        // should return an array of integers entered from keyboard;
        for (int i = 0; i < size; i++) {
            startArray[i] = scanner.nextInt();
        }
        scanner.close();
        return startArray;
    }

    public static void printArray(int[] array) {
        System.out.println("This is the array of numbers you entered: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
    }

    public static int[] sortIntegers(int[] start) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < start.length - 1; i++) {
                if (start[i] > start[i + 1]) {
                    temp = start[i];
                    start[i] = start[i + 1];
                    start[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return start;
    }
}
