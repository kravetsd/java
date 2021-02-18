package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore(true,80,5,100);
        calculateScore(false,1300,6,300);
    }
    public static int calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){
        //boolean gameOver = true;
        //int score = 80;
        //int levelCompleted = 5;
        //int bonus = 100;

        if (gameOver) {
            int finalScore = levelCompleted * bonus + score;
            System.out.println("this is a final score : " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
