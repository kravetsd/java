import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean newBranch(String branchName){
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
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
}
