package com.javams;

public class Main {

    public static void main(String[] args) {
        //Primitive types challenge:
        byte challengeByteValue;
        challengeByteValue = (byte) 1000;

        short challengeShortValue;
        challengeShortValue = (short) 1000;

        int challengeIntValue;
        challengeIntValue = 1000;

        long challengeLongValue;
        challengeLongValue = 50000L + 10L*(challengeByteValue + challengeShortValue + challengeIntValue);

        System.out.println(challengeLongValue);
    }
}
