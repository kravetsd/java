import java.util.ArrayList;

class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName())>=0){
            System.out.println("no contacts found");
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact)>=0){
            myContacts.set(findContact(oldContact),newContact);
            return true;
        }
        return false;
    }

    public  boolean removeContact(Contact contact){
        if (findContact(contact)>=0){
            myContacts.remove(findContact(contact));
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i < myContacts.size() ; i++) {
            if (myContacts.get(i).getName().equals(name)){
                return myContacts.indexOf(myContacts.get(i));
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for (int i = 0; i < myContacts.size() ; i++) {
            if (myContacts.get(i).getName().equals(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
        }

    }
}
