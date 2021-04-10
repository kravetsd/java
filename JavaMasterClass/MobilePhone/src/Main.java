import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+392-111-222-333");

    public static void main(String[] args) {

        boolean exit = false;
        printInstructions();

        while (!exit){
            System.out.print("Manage your contacts.\nEnter a number to choose the next action: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }




    }

    public static void printInstructions(){
        System.out.println("\tPress ");
        System.out.println("\t0 - To print these instructions");
        System.out.println("\t1 - To print the list of contacts");
        System.out.println("\t2 - To add an item to the list");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - To remove an item from the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - To quit the application");
    }
}
