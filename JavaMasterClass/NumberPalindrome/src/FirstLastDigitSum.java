public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number <0) {
            return  -1;
        }
        int lastDig = number%10;
        while (number/10 != 0){
            number /=10;
        }
        return lastDig+number;
    }
}
