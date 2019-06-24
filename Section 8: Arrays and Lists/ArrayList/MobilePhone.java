//ArrayListChallenge
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) { //constructor accepting a phone nr
        this.myNumber = myNumber;
        this.myContacts =  new ArrayList<Contacts> (); // initialize a new empty array
    }
    public boolean addNewContact (Contacts contact){ //false if it already exists
        if (findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;      // record added successfully
    }

    public boolean removeContact(Contacts contact){
        if(findContact(contact)<0){
            System.out.println(contact.getName() + " not found.");
            return false;
        }
        this.myContacts.remove(findContact(contact)); // remove contact at this index
        System.out.println(contact.getName() + " was removed");
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        if (findContact(oldContact)<0){
            System.out.println(oldContact.getName()+ " was not found");
            return false; // not updated
        }
        this.myContacts.set(findContact(oldContact), newContact);
        System.out.println(oldContact.getName()+ " was replaced with "+ newContact.getName());
        return true; //update successful
    }

    private int findContact(Contacts contact){// only used within this class (private), search by contact
        return this.myContacts.indexOf(contact); //returning the index position of contact
    }
    private int findContact(String contactName){
        for (int i=0; i<this.myContacts.size(); i++){// search by contactName
            if(this.myContacts.get(i).getName().equals(contactName)){
                return i; //return the array position of the contact
            }
        }return -1; // if not found returns -1
    }
    public String queryContact (Contacts contact){// return as a String, from prev method
        if(findContact(contact)>=0){ //contact exists
            return contact.getName();// return the name in the contact
        }return null;//contact doesn't exist

    }
    public Contacts queryContact (String name){ // returns the contact with that name
        if (findContact(name)>=0){ //if exists
            return this.myContacts.get(findContact(name));
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i =0; i<this.myContacts.size(); i++){
            System.out.println(i+1 + ") "+ this.myContacts.get(i).getName()+ ": "+ this.myContacts.get(i).getPhoneNumber());
        }
    }
}
