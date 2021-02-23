package com.javams;

/*public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer) {
            return isInRange(temperature,25,45);
        } else {
            return isInRange(temperature,25,35);
        }
    }
    public static boolean isInRange(int target,int smallest, int highest){
        return (target>=smallest && target<=highest);
    }
}*/

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer) {
            return (temperature>=25 && temperature<=45);
        } else {
            return (temperature>=25 && temperature<=35);
        }
    }
}