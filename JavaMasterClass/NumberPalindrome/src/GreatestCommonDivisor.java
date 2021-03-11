public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10){
            return -1;
        }
        int looper = Math.max(first, second);
        while (looper>0){
            if (first%looper==0 && second%looper==0){
                return looper;
            }
            looper-=1;
        }
        return -1;
    }
}
