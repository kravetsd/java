package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] intarray;
        intarray = new int[10]; // created array with 10 spaces for elements;
        int [] myarrvar = new  int[20]; // the same but in the one line;

        for (int i = 0; i < myarrvar.length; i++){
            myarrvar[i] = i;
        }

        for (int j : myarrvar) {
            System.out.println(j);
        }

        int [] intArray = {1,2,3,4,5,6,7,8,9,0}; // only when we first time define an array!
        System.out.println(intArray);
    }
}
