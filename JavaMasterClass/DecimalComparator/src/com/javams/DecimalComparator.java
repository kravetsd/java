package com.javams;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstParam, double secondParam){
        return (int)(firstParam*1000) == (int)(secondParam*1000);
    }
}
