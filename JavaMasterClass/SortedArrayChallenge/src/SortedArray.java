import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to know the size of the array you need: ");
        for (int i = 0; i < array.length; i++) {
//            System.out.print("Enter "+(i+1)+" value:  ");
            array[i] = scanner.nextInt();
//            scanner.nextLine();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0;i< array.length; i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] arrayToSort){
        int[] sortedArray = Arrays.copyOf(arrayToSort,arrayToSort.length);
        int temp;
        boolean notSorted = true;

        while (notSorted){
            notSorted =false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    notSorted = true;
                }

            }
        }

        return sortedArray;

    }

}
