public class threeAndFive {
    public static void main(String[] args) {
        System.out.println("this is a main method");
        int accum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i%3==0) && (i%5==0)){
                count++;
                accum+= i;
                System.out.println("Found a number = "+i);
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum of 3 and 5 challenge is "+accum);
    }
}
