package com.javams;

public class IntEqualityPrinter {
    public  static void printEqual(int oneParam, int twoParam, int threeParam){
        if (oneParam<0 || twoParam<0 || threeParam<0){
            System.out.println("Invalid Value");
        } else if (oneParam == twoParam && twoParam == threeParam) {
            System.out.println("All numbers are equal");
        } else if (oneParam != twoParam && twoParam!=threeParam && oneParam!=threeParam){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
