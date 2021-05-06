import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Dima", 54.96);

        Customer anotherCustomer;
        anotherCustomer = customer;

        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for Customer " + customer.getName() + " = " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++)
        {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.remove(1);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));

        }
    }
}
