package com.javams;

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
    }
}
