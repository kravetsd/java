package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code her
        System.out.println(calcFeetAndInchesToCentimeters(6,7));
        System.out.println(calcFeetAndInchesToCentimeters(0,7));
        System.out.println(calcFeetAndInchesToCentimeters(69));

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet<0 || (inches<0 || inches>12)){
            return -1;
        }
        // 1 inch = 2.54cm; 1 foot = 12 inches
        return 2.54*(inches+feet*12);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0){
            return -1;
        }
        // 1 inch = 2.54cm; 1 foot = 12 inches
        int feets = (int) inches/12;
        int inchesRemaining = (int) inches%12;
        return calcFeetAndInchesToCentimeters(feets,inchesRemaining);
    }
}
