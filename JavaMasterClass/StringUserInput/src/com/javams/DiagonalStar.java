package com.javams;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
        } else {
            for (int raw = 1; raw <= number; raw++) {
                for (int column = 1; column < number; column++) {
                    //System.out.print("("+raw+","+column+")");
                    if (raw == 1 || raw == number) {
                        System.out.print("*");
                    } else if (column == 1) {
                        System.out.print("*");
                    } else if (raw == column) {
                        System.out.print("*");
                    } else if (column == number - raw + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        }
    }
}
