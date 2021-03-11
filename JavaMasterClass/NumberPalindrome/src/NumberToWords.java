public class NumberToWords {
    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        } else {
            int backup = reverse(number);
            while (backup>0) {
                switch (backup % 10) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("other".toUpperCase());
                }
                backup /= 10;
            }
            if (backup!=number){
                for (int i = 1; i<=getDigitCount(number)-getDigitCount(backup) ; i++) {
                    System.out.print("Zero");
                }
            }
        }
    }
    public static int getDigitCount(int number){
        if (number<0){
            return -1;
        }
        int counter=1;
        number/=10;
        while (number>0){
            number/=10;
            counter++;
        }
        return counter;
    }
    public static int reverse(int number){
        int sign=1;
        if (number<0){
            sign=-1;
        }
        int backup = Math.abs(number);
        int revers = 0;
        int lastDigit;
        while (backup>0){
            lastDigit=backup%10;
            revers=revers*10;
            revers+=lastDigit;
            backup/=10;
        }
        return revers*sign;
    }
}
