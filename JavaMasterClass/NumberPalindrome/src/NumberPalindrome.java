public class NumberPalindrome {
    public static boolean isPalindrome (int number){
        number = Math.abs(number);
        int revers = 0;
        int lastDigit;
        int backup = number;
        while (number > 0){
            lastDigit = number%10;
            revers = revers*10;
            revers += lastDigit;
            number = number/10;
        }
        return backup == revers;
    }
}
