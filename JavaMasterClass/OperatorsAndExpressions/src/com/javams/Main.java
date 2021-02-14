package com.javams;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1+2; // 1 + 2 = 3;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = "+previousResult);

        result = result - 1; //3 - 1 =2;
        System.out.println("3 - 1 = "+result);
        System.out.println("previousResult = " + previousResult);

        result = result*10;
        System.out.println(result);

        result = result/5;
        System.out.println(result);

        result = result % 3;
        System.out.println("4 % 3 = "+result);

        result++; //1 + 1 = 2
        System.out.println("1 + 1 = "+result);

        result--; //2 - 1 = 1
        System.out.println( "2 - 1 ="+result);

        // result=result + 2;
        result +=2;
        System.out.println("1 + 2 = " +result);

        // result = result * 10
        result*= 10;
        System.out.println("3 * 10 ="+result);

        // result = result / 3
        result /=3;
        System.out.println("30 / 3 = " + result );

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("it is not an alien");
        System.out.println("And I am scared");

        boolean isWithCodeBlock = true;
        if (isWithCodeBlock){
            System.out.println("this if then statement is with");
            System.out.println("code block");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("Topscore is greater then or equal tp 100");
            System.out.println("All other possible variants: " +
                    "greater > \n" +
                    "lower < \n" +
                    "not equesl != \n" +
                    "less then or equal to <= \n" +
                    "grater then or equal to >= \n" +
                    "is equal to ==");
        }
        if (topScore >= 100 && topScore<120){
            System.out.println("Topscore is greater then or equal to 100 AND less then 120");
        }

        int thirdTopScore = 60;
        if (thirdTopScore<50 && thirdTopScore!=61 || thirdTopScore==60 && thirdTopScore <50){
            System.out.println( "ThirdTopScore is less then 50 and not equal to 61 OR it is equal to 60");
        }
    }
}
