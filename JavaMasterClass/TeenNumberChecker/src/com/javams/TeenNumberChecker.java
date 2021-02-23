package com.javams;

public class TeenNumberChecker {
    public static boolean isTeen(int number){
        return (number >= 13)&&(number <= 19);
    }

    public static boolean hasTeen(int firstPar, int secondPar, int thirdPar){
        return isTeen(firstPar) || isTeen(secondPar) || isTeen(thirdPar);
    }
}
