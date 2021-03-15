package com.javams;

import java.util.Scanner;


/*
TIP: Use Scanner to read an input from the user.

        TIP: Use casting when calling the round method since it needs double as a parameter.

        NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

        NOTE: Be mindful of spaces in the printed message.

        NOTE: Be mindful of users who may type an invalid input right away (see example above).

        NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far in the course.

        NOTE: Do not add the main method to the solution code.
*/

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        long avg = 0;
        double count = 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            boolean isAnInteger = scanner.hasNextInt();
            if (isAnInteger){
                sum+=scanner.nextInt();
                avg = (int) Math.round((double) sum/count);
            } else {
                break;
            }
            scanner.nextLine();
            count++;
        }
        scanner.close();
        System.out.println("SUM = "+ sum+" AVG = "+avg);
    }
}
