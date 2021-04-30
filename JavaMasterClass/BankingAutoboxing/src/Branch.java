import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String customerName, Double initialAmount){
        if (findCustomer(customerName) == null){
            customers.add(new Customer(customerName,initialAmount));
            return true;
        }

        return false;
    }

    public boolean addTransaction(String customerName, Double amount ){
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer != null){
            foundCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for (int i=0;i<customers.size();i++){
            if (customers.get(i).getName().equals(name)){
                return customers.get(i);
            }
        }
        return null;
    }




}
