package com.javams;

public class GetDuration {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds){
        if (minutes<0 || (seconds<0 || seconds>59)){
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes/60;
        return hours+"h "+minutes%60+"m "+ seconds +"s";
    }
    public static String getDurationString(int seconds){
        if (seconds<0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds/60;
        return getDurationString(minutes,seconds%60);
    }
}
