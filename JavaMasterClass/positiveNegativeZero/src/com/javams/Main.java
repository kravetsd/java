package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        checkNimber(1000);
    }

    public static void checkNimber(int number) {
        if (number > 0){
            System.out.println("Number "+number+" is positie");
        } else if (number < 0){
            System.out.println("number " + number + " is negative");
        }
        else {
            System.out.println("Number is Zero!");
        }
    }
}
