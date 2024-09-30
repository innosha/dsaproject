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

public class SearchContact {
    private ContactNode head; // Head of the linked list

    // Function to insert a new contact
    public void insertContact(String name, String phoneNumber, String emailAddress) {
        ContactNode newContact = new ContactNode(name, phoneNumber, emailAddress);
        newContact.next = head;
        head = newContact;
    }

    // Function to search for a contact by name, phone number, or email
    public ContactNode searchContact(String searchKey) {
        ContactNode current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(searchKey) || 
                current.phoneNumber.equals(searchKey) || 
                current.emailAddress.equalsIgnoreCase(searchKey)) {
                return current;  // Contact found
            }
            current = current.next;
        }
        return null;  // Contact not found
    }

    public static void main(String[] args) {
        SearchContact phonebook = new SearchContact();
        phonebook.insertContact("John Doe", "123-456-7890", "john@example.com");
        phonebook.insertContact("Jane Smith", "987-654-3210", "jane@example.com");

        ContactNode result = phonebook.searchContact("John Doe");
        if (result != null) {
            System.out.println("Contact found: Name: " + result.name + ", Phone: " + result.phoneNumber + ", Email: " + result.emailAddress);
        } else {
            System.out.println("Contact not found.");
        }
    }
}
