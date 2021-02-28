package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int year = 2021;
        int jan = NumberOfDaysInMonth.getDaysInMonth(2,year);
        int feb = NumberOfDaysInMonth.getDaysInMonth(1,year);
        for (int i = 1; i < 13; i++) {
            System.out.println(NumberOfDaysInMonth.getDaysInMonth(i,year)+ " days in "+i+"-th month of "+year+"-th year");
        }
    }
}
