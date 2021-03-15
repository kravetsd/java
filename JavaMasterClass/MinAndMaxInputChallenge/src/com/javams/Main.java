package com.javams;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min=Integer.MAX_VALUE; // this was set to max values to handle the first iteration of min vs max election
        int max=Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number:");
            if (!scanner.hasNextInt()){
                break;
            } else {
                int num = scanner.nextInt();
                // This is one more method using additional check if it is a first iteration
/*                if (max==0 && min==0){
                    min=num;
                    max=num;
                }
                */if (num<min){
                    min=num;
                }
                if (num>max){
                    max=num;
                }
            }
            System.out.println("election finished");
            scanner.nextLine(); //handling a new line character;
        }
        scanner.close();
        System.out.println("Min="+min+", Max="+max);
    }
}
