import java.util.Arrays;

public class ReverseArray {
/*    public static void main(String[] args) {
        int[] ar = new int[] {1,2,3,4,5,6};
        reverse(ar);
    }*/

    private static void reverse(int[] array){
        System.out.println("Array = "+Arrays.toString(array));
        int tmp;
        int n = array.length/2;
        for (int i=0;i<=n-1;i++){
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));
    }
}
