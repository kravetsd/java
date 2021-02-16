package com.javams;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;

//        if (score == 5000) {
//            System.out.println(" Your score was 5000");
//        }
//
//        if (score == 4000)
//            System.out.println(" Your score was 5000"); // this is also valid one line statement, but the only one line!
//            System.out.println( " this will ne executed anyway");
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("the score is less than 5000, but more that 1000");
//        } else if (score < 1000){
//            System.out.println("score is less than 1000");
//        }
//        else {
//            System.out.println("got here");
//        }

        // --- Variables created in the code block:

        if (gameOver){
            int score = 80;
            int levelCompleted = 5;
            int bonus = 100;
            int finalScore = levelCompleted*bonus + score;
            System.out.println("this is a final score : " + finalScore);
        }
        //System.out.println(" Here i am trying to reach variable from codeblock: " + finalScore); This will not work.

        // challenge
        if (gameOver) {
            int score = 10000;
            int levelCompleted = 8;
            int bonus = 100;
            int finalScore = levelCompleted*bonus + score;
            System.out.println("this is a final score : " + finalScore);
        }
    }
}
