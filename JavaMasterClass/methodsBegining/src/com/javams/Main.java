package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore(true,80,5,100);


        int highScore = calculateScore(true,1300,6,300);
        System.out.println("Your final score was : "+highScore);
    }
    public static int calculateScore(boolean gameOver, int score,int levelCompleted, int bonus){
        //boolean gameOver = true;
        //int score = 80;
        //int levelCompleted = 5;
        //int bonus = 100;

        if (gameOver) {
            int finalScore = levelCompleted * bonus + score;
            return finalScore;
        } else {
            return -1;
        }
    }
}
