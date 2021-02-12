package com.javams;

public class Main {

    public static void main(String[] args) {
        // primitives in Java:
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue+1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest + " this is a test");


        // bytes - 8 bits

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue );
        System.out.println("Byte Maximum Value = " + myMaxByteValue );

        // short 16 bits
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue );
        System.out.println("Short Maximum Value = " + myMaxShortValue );
        
        //long
        long myLongValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue );
        System.out.println("Long Maximum Value = " + myMaxLongValue );

        long bigLongLiteralValue = 2_147_483_649876L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        // Casting variables in Java:
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
