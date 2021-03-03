package com.javams;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while (count!=2){
            System.out.println("This is a count "+count);
            count++;
        }
        count = 1;
        while (true){
            if (count > 2 ){
                break;
            }
            System.out.println("This is a count "+count);
            count++;
        }
        count = 1;
        do {
            System.out.println("This is do while loop count "+ count);
            count ++;
        } while (count !=2);

        int start = 4;
        int finish = 29;
        count = 0;
        while (start<=finish){
            start++;
            if (!isEvenNumber(start)){
                continue;
            }
            if (count >= 5){
                break;
            }
            count++;
            System.out.println("Even number "+ start);
        }
        System.out.println("Total number of even founded is "+ count);

    }
    public static boolean isEvenNumber(int number){
        return number%2==0;
    }
}
