import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your shopping list");
        for (int i=0; i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryList(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+position+" has been modified.");
    }
    public void addGroceryItem(String item){
        System.out.println("Item "+item+" has been added to your shopping list");
        groceryList.add(item);
    }
    public void removeGroceryItem(int position){
        System.out.println("Grocery item "+groceryList.get(position)+" has been removed from your shopping list");
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if (position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}
