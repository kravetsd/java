public class SharedDigit {
    public static boolean hasSharedDigit(int numOne, int numTwo){
        if ((numOne<10 || numOne>99) || (numTwo<10 || numTwo >99)){
            return false;
        }
        int compare;
        int tmpNumTwo=numTwo;
        while (numOne>0){
            compare = numOne%10;
            while (numTwo>0){
                if (compare == numTwo%10){
                    return true;
                }
                numTwo/=10;
            }
            numTwo = tmpNumTwo;
            numOne/=10;
        }
        return false;
    }
}
