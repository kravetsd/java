package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double myDoubleVar = 20.00d;
        double mySecondDoubleVar = 80.00d;

        double sumDoubles = (myDoubleVar + mySecondDoubleVar)*100;

        double myReminder = sumDoubles%40d;

        boolean isReminderNull = (myReminder == 0) ? true : false;
        System.out.println(isReminderNull);
        if (isReminderNull != true) {
            System.out.println("Got some reminder");
        }
    }
}
