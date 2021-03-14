package com.javams;

public class LargestPrime {
    public static int getLargestPrime (int number){
        if (number<=1){
            return -1;
        }
        int looper=number-1;
        while (looper>1){
            // checking if looper is a facter
            System.out.println("Checking if "+looper+" is a prime facter");
            if (number%looper==0){
                System.out.println(looper + " is a possible prime facter");
                // starting check if facter is a prime number
                System.out.println("starting to check if "+looper+" is a prime facter");
                for (int i = looper-1; i >= 1; i--) {
                    System.out.println("testing if "+looper+" is devided by "+ i);
                    if (looper%i==0){
                        System.out.println(looper+" is devided by "+ i+" => breaking the loop");
                        if (i == 1){
                            return looper;
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println("decrementing looper ");
            looper--;
        }
        return  number;
    }
}
