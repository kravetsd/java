import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("+392-111-222-333");

    public static void main(String[] args) {

        boolean exit = false;
        System.out.print("CONTACTS application.\nEnter a number to choose the next action:");
        printInstructions();

        while (!exit){
            System.out.print("Your choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
            }
        }
    }

    public static void addContact(){
        System.out.print("Please add a contact name :");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Please add a "+name+"'s number");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name,number);
        mobilePhone.addContact(newContact);
    }
    public static void printInstructions(){
        System.out.println("\tPress ");
        System.out.println("\t0 - To print these instructions");
        System.out.println("\t1 - To print the list of contacts");
        System.out.println("\t2 - To add a contact");
        System.out.println("\t3 - To modify a contact");
        System.out.println("\t4 - To remove a contact");
        System.out.println("\t5 - To search for a contact");
        System.out.println("\t6 - To quit the application");
    }
}
