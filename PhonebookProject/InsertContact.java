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

public class InsertContact {
    private ContactNode head; // Head of the linked list

    // Function to insert a new contact at the beginning of the linked list
    public void insertContact(String name, String phoneNumber, String emailAddress) {
        ContactNode newContact = new ContactNode(name, phoneNumber, emailAddress);
        newContact.next = head;
        head = newContact;
        System.out.println("Contact added successfully: " + name);
    }

    public static void main(String[] args) {
        InsertContact phonebook = new InsertContact();
        phonebook.insertContact("John Doe", "123-456-7890", "john@example.com");
        phonebook.insertContact("Jane Smith", "987-654-3210", "jane@example.com");
    }
}
