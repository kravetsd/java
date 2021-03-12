public class NumberToWords {
    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        } else if (number == 0){
            System.out.println("Zero");
        } else {
            StringBuilder answer = new StringBuilder();
            int backup = reverse(number);
            while (backup>0) {
                switch (backup % 10) {
                case 0:
                    answer.append("Zero");
                    break;
                case 1:
                    answer.append("One");
                    break;
                case 2:
                    answer.append("Two");
                    break;
                case 3:
                    answer.append("Three");
                    break;
                case 4:
                    answer.append("Four");
                    break;
                case 5:
                    answer.append("Five");
                    break;
                case 6:
                    answer.append("Six");
                    break;
                case 7:
                    answer.append("Seven");
                    break;
                case 8:
                    answer.append("Eight");
                    break;
                case 9:
                    answer.append("Nine");
                    break;
                default:
                    System.out.print("other".toUpperCase());
                }
                backup /= 10;
                if(backup!=0){
                    answer.append(" ");
                } else {
                    for (int i = 0; i < (getDigitCount(number)-getDigitCount(reverse(number))); i++) {
                        answer.append(" Zero");
                    }
                }
            }
            System.out.println(answer);
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
