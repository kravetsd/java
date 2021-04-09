import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean updateContact(Contact contactToUpdate, Contact newContact){
        myContacts.set(contactIndex,newContact);
    }

    public updateContact(Contact contactName,)

    public boolean addNewContact(Contact contact){
        int contactIndex = findContact(contact);
        if (contactIndex>=0){
            return true;
        }
        return false;
    }

    private int findContact(Contact findContact){
        return myContacts.indexOf(findContact);
    }
}
