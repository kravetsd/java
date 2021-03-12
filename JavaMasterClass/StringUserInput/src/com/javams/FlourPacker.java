package com.javams;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if ((bigCount*5+smallCount*1)>=goal ){
            if (goal%5==0 && goal/5>=bigCount){
                return true;
            }
        }
        return (bigCount*5+smallCount*1)==goal;
    }
}
