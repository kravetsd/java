package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code her
        displayHighScorePosition("Dima",2);
        int result = calculateHighScorePosition(-1);
        System.out.println("1 = " + calculateHighScorePosition(1000) + " because input is more then 1000 ");
        System.out.println("2 = " + calculateHighScorePosition(500) + " because input is less then 1000 but more then 500 ");
        System.out.println("3 = " + calculateHighScorePosition(100) + " because input is less then 500 but more then 100 ");
        System.out.println("4 = " + calculateHighScorePosition(100) + " because input is less then 100");

        System.out.println(result + " is a result of passing -1 to the function");
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100){
            return 3;
        } else {
            return 4;
        }
    }
}
