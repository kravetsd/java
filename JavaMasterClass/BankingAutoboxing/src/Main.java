import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank("HSBC");

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.newBranch("Adelaide");

        bank.newCustomer("Adelaide", "Tim", 50.05);
        bank.newCustomer("Adelaide", "Mike", 175.34);
        bank.newCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Melbourne", true);


    }
}
