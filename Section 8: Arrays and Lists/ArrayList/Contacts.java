//ArrayListChallenge
public class Contacts {
    public String name;
    public String phoneNumber;

    public Contacts(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    public String getName() { // no setter because using constructor instead
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contacts createContact (String name, String phoneNumber){
        return new Contacts(name, phoneNumber); // calling the constructor to create a new contact
    }
}
