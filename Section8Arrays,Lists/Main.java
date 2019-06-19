import java.util.Scanner;

public class Main {
    //ArrayListChallenge
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // create MobilePhone and Contacts classes.
    private static Scanner in = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("339 126 1245");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printMenu();
        while (!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            int action = in.nextInt();
            in.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down.");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printMenu();
                    break;
            }

        }

    }

    private static void addContact(){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the contact name: ");
        String addn = in.nextLine();
        if (mobilePhone.queryContact(addn) == null) {
            System.out.print("Enter the contact number: ");
            String addnr = in.nextLine();
            mobilePhone.addNewContact(Contacts.createContact(addn, addnr));
            System.out.println("New contact added--> "+ addn+ ": "+ addnr);
        } else {
            System.out.println("Contact " + addn + " is already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the name of the old contact: ");
        String oldn=in.nextLine();
        if (mobilePhone.queryContact(oldn) == null) {
            System.out.println("Contact "+ oldn+ " not found.");
        }else{
            Contacts oldc = mobilePhone.queryContact(oldn);
            System.out.println("Enter the name of the new contact: ");
            String newname= in.nextLine();
            System.out.println("Enter the number of the new contact: ");
            String newnumber=in.nextLine();
            Contacts newc = Contacts.createContact(newname, newnumber);
            mobilePhone.updateContact(oldc, newc);
        }

    }

    private static void removeContact() {
        System.out.println("Enter the name of the contact to be removed: ");
        String removen=in.nextLine();
        if (mobilePhone.queryContact(removen)==null){
            System.out.println("Contact "+ removen+ " not found.");
        }else {
            Contacts c = mobilePhone.queryContact(removen);
            mobilePhone.removeContact(c);
        }
    }

    private static void queryContact() {
        System.out.println("Enter the name of the contact to query: ");
        String queryname=in.nextLine();
        if (mobilePhone.queryContact(queryname)==null){
            System.out.println("Contact "+ queryname+ " not found.");
        }else {
            Contacts contact = mobilePhone.queryContact(queryname);
            System.out.println("Phone number of " + contact.getName() + " is " + contact.getPhoneNumber());
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printMenu() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" + "1 - to print contacts\n" + "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" + "4 - to remove an existing contact\n" +
                "5 - query if a contact exists\n" + "6 - print a list of available actions");
        System.out.println("Choose your action: ");
    }

}
