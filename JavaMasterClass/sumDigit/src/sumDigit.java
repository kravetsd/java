public class sumDigit {
    public static int sumDigits(int number){
        int sum=0;
        if (number>=10){
            while (number/10>0){
                sum +=number%10;
                number = number/10;
            }
            sum+=number;
            return  sum;
        }
        return -1;
    }
}
