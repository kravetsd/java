import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public void printContacts(){
        System.out.println("Your contacts: ");
        System.out.println("You have "+myContacts.size()+ " contacts ");
        for (int i = 0; i < myContacts.size() ; i++) {
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getNumber());
        }
        System.out.println("------------------------------------");
    }

    public boolean updateContact(Contact contactToUpdate, Contact newContact){
        if (inContacts(contactToUpdate)){
            updateContact(findContact(contactToUpdate),newContact);
            return true;
        }
        return false;
    }

    private void updateContact(int index, Contact newContact){
        myContacts.set(index,newContact);
        System.out.println("Contact "+newContact.getName()+" was updated");
    }

    public boolean inContacts(Contact contact){
        int contactIndex = findContact(contact);
        if (contactIndex>=0){
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
}
