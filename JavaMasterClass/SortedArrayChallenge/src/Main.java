import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*        int [] myVar = SortedArray.getIntegers(5);
//        SortedArray.printArray(myVar);

        SortedArray.printArray(SortedArray.sortIntegers(myVar));*/
        int myint = 9;
        int anotherint = myint;

        anotherint++;

        int[] intArray = new int[10];
        int a = intArray[0];
        int b = intArray[0];

        int[] bArr = intArray;
        int[] aArr = intArray;

        System.out.println("bArr = " + Arrays.toString(bArr));
        System.out.println("aArr = " + Arrays.toString(aArr));

        bArr[0] = 1;

        bArr[4] = 4444;

        System.out.println("bArr = " + Arrays.toString(bArr));
        System.out.println("bArr = " + Arrays.toString(aArr));

        modifyArray(bArr);

        System.out.println("bArr = " + Arrays.toString(bArr));
        System.out.println("bArr = " + Arrays.toString(aArr));


    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length;i++){
            System.out.print(" "+array[i]+" ");
        }
    }

    public static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,34,5,6,7,8};
        array[0]= 333;
        System.out.println("This is an array inside the function: "+Arrays.toString(array));
    }
}
