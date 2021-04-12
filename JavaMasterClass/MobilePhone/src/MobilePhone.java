import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact){
        myContacts.add(newContact);
        System.out.println("A new contact '"+newContact.getName()+"' added. Phone number: "+newContact.getNumber());
    }
    public void printContacts(){
        System.out.println("Your contacts: ");
        System.out.println("You have "+myContacts.size()+ " contacts ");
        for (int i = 0; i < myContacts.size() ; i++) {
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getNumber());
        }
        System.out.println("------------------------------------");
    }

    public void removeContact(Contact removecontact){
        myContacts.remove(findContact(removecontact));
        System.out.println("Contct "+removecontact.getName()+" was removed.");
    }
    public void updateContact(Contact contactToUpdate, Contact newContact){
            updateContact(findContact(contactToUpdate), newContact);
    }

    private void updateContact(int index, Contact newContact){
        myContacts.set(index,newContact);
        System.out.println("Contact "+newContact.getName()+" was updated");
    }

    public boolean inContacts(Contact contact){
        if (contact.getNumber() == null) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (contact.getName().equals(myContacts.get(i).getName())) {
                    return true;
                }
            }
        }
        int contactIndex = findContact(contact);
        return contactIndex>=0;
    }

    private int findContact(Contact contact){
        for (int i = 0; i < myContacts.size() ; i++) {
            if (contact.getName().equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return myContacts.indexOf(contact);
    }
}
