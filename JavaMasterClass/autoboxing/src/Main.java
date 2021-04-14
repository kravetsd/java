import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    String[] stringArray = new String[10];
    int[] intarray = new int[10];


    static ArrayList<String> strArrayList = new ArrayList<String>();
    public static void main(String[] args) {
        strArrayList.add("Dima");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(2);

        System.out.println(integerArrayList.toString());
    }
 }

