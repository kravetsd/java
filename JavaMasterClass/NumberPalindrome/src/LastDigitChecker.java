public class LastDigitChecker {
    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){
        if (isValid(numOne) && isValid(numTwo) && isValid(numThree) ){
            return numOne%10==numTwo%10 || numTwo%10==numThree%10 || numOne%10==numThree%10;
        }
        return false;

    }

    public static boolean isValid(int num){
        return num>=10 && num<=1000;
    }
}
