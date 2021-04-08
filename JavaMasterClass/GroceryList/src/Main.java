import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean exit = false;
        System.out.println("Please follow the next instructions");
        printInstructions();

        while (!exit){
            System.out.print("Please enter your choice : ");
            int enter = scanner.nextInt();
            switch (enter){
                case 0:
                    printInstructions();
                    scanner.nextLine();
                    break;
                case 1:
                    scanner.nextLine();
                    printGroceryItems();
                    break;
                case 2:
                    scanner.nextLine();
                    addGroceryItem();
                    break;
                case 3:
                    scanner.nextLine();
                    modifyGroceryList();
                    break;
                case 4:
                    scanner.nextLine();
                    removeGroceryItem();
                    break;
                case 5:
                    scanner.nextLine();
                    searchForItem();
                    break;
                case 6:
                    exit = true;
                    scanner.nextLine();
                    break;
                case 7:
                    processGroceryList();
                default:
                    scanner.nextLine();
                    System.out.println("Please follow instructions: ");
                    printInstructions();

            }

        }

    }

    public static void searchForItem(){
        System.out.println("Please enter the item you are looking for: ");
        String searchItem = scanner.nextLine();
        boolean found = groceryList.onFile(searchItem);
        if (found){
            System.out.println("We found "+searchItem+" in your shopping list");
        } else {
            System.out.println("We didn't find "+searchItem+" in your shopping list.");
        }
    }

    public static void removeGroceryItem(){
        System.out.print("Please enter item name you wish to remove from your shopping list: ");
        String itemToRemove = scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemove);
    }

    public static void modifyGroceryList(){
        System.out.print("Please enter the item you wish to modify: ");
        String currentItem = scanner.nextLine();
        System.out.print("Please enter the name of the item you wish to add: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(currentItem,newItem);
    }

    public static void addGroceryItem(){
        System.out.print("Please enter the item you wish to add to the shopping list: ");
        String item = scanner.nextLine();
        groceryList.addGroceryItem(item);
    }
    public static void printGroceryItems(){
        groceryList.printGroceryList();
    }

    public static void printInstructions(){
        System.out.println("\tPress ");
        System.out.println("\t0 - To print these instructions");
        System.out.println("\t1 - To print the list of grocery items");
        System.out.println("\t2 - To add an item to the list");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - To remove an item from the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - To quit the application");
    }

    public static void processGroceryList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
