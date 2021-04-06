import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList <String> arrayList = new ArrayList<String>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        arrayList.add(0,"first");
        addItem("Milk",1);
        addItem("Bread",2);
        System.out.println(arrayList.toString());
        getItem(1);
        removeItem(1);
        System.out.println(arrayList.toString());

    }

    public static void getItem(int count){
        System.out.println("This is a "+(count+1)+ " item from arraylist : "+arrayList.get(count));
    }

    public static void addItem(String item, int count){
        System.out.println("Added "+item+" item to arraylist");
        arrayList.add(item);
    }

    public static void removeItem(int count){
        System.out.println("Removed "+(count+1)+" item from arraylist");
        arrayList.remove(count);
    }
    public static String findItem(String item){
        boolean exist = arrayList.contains(item);
        int position = arrayList.indexOf(item);
        getItem(position);
        if (position>=0){
            return arrayList.get(position);
        }
        return null;
    }
}
