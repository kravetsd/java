package com.javams;

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal){
        int looper = goal;
        int tmpBigCount = bigCount;
        if (bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        if (goal==5 || goal==1){
            return true;
        }
        if ((bigCount*5+smallCount*1)>=goal ){
            while (looper>5){
                if (tmpBigCount>0){
                    tmpBigCount-=1;
                    looper-=5;
                } else {
                    break;
                }
            }
            if (looper<=smallCount){
                return true;
            }
        }
        return (bigCount*5+smallCount*1)==goal;
    }
}
