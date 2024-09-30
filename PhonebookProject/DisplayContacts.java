class ContactNode {
    String name, phoneNumber, emailAddress;
    ContactNode next;

    public ContactNode(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.next = null;
    }
}

public class DisplayContacts {
    private ContactNode head; // Head of the linked list

    // Function to insert a new contact
    public void insertContact(String name, String phoneNumber, String emailAddress) {
        ContactNode newContact = new ContactNode(name, phoneNumber, emailAddress);
        newContact.next = head;
        head = newContact;
    }

    // Function to display all contacts in the phonebook
    public void displayAllContacts() {
        if (head == null) {
            System.out.println("The phonebook is empty.");
            return;
        }

        ContactNode current = head;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Phone: " + current.phoneNumber + ", Email: " + current.emailAddress);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DisplayContacts phonebook = new DisplayContacts();
        phonebook.insertContact("John Doe", "123-456-7890", "john@example.com");
        phonebook.insertContact("Jane Smith", "987-654-3210", "jane@example.com");

        System.out.println("Displaying all contacts:");
        phonebook.displayAllContacts();
    }
}
