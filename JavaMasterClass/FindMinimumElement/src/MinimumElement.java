import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
/*    public static void main(String[] args) {
        int arraySize = MinimumElement.readInteger();
        int[] array = MinimumElement.readElements(arraySize);
        System.out.println("This is a minimum element of the array: "+MinimumElement.findMin(array));
    }*/

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        return size;
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
}
