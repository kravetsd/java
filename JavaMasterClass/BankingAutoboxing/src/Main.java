import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank("HSBC");

    public static void main(String[] args) {
        bank.newBranch("Karagandy");
        bank.newBranch("Sortirovka");
        bank.newBranch("Taincha");

        bank.newCustomer("Karagandy","Dmitriy Kravets",100.00);
        bank.addCustomerTransaction("Karagandy","Dmitriy Kravets",10.00);
        bank.addCustomerTransaction("Karagandy","Dmitriy Kravets",5.00);
        bank.newCustomer("Sortirovka","babushka",20.00);
        bank.addCustomerTransaction("Sortirovka","babushka",115.00);
        bank.newCustomer("Taincha","Vera",13.00);
        bank.addCustomerTransaction("Taincha","Vera",50.00);
        bank.listCustomers("Karagandy",true);
        bank.listCustomers("Sortirovka",true);
        bank.listCustomers("Taincha",false);


        if (!bank.newBranch("Sortirovka")){
            System.out.println("Sortirovka branch already exist");
        }


    }
}
