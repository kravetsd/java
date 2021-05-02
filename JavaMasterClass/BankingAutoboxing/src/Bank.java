import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
        System.out.println("Bank "+name+" has been opened.");
    }

    public boolean newBranch(String branchName){
        Branch foundBranch = findBranch(branchName);
        if (foundBranch == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean newCustomer(String branchName, String customerName, Double initialAmount){
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null){
            return foundBranch.addCustomer(customerName,initialAmount);

        }

        return false;
    }

    private Branch findBranch(String name){
        for (int i=0;i<branches.size();i++){
            if (this.branches.get(i).getName().equals(name)){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, Double amount){
        Branch targetBranch = findBranch(branchName);
        if (targetBranch != null){
            return targetBranch.addTransaction(customerName,amount);
        }

        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        System.out.println("List of customers for "+branchName);
        if (findBranch(branchName) != null){
            Branch targetBranch = findBranch(branchName);
            for (int i=0; i<targetBranch.getCustomers().size();i++){
                Customer customer = targetBranch.getCustomers().get(i);
                System.out.println("["+(i+1)+"] "+customer.getName());
                if (showTransactions){
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j=0;j<transactions.size();j++){
                        System.out.println(transactions.get(j)+"$");
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
