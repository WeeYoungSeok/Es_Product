package weekThree.domain;

import weekThree.view.constans.OutputMessage;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void displayContacts() {
        if (this.contacts.isEmpty()) {
            System.out.println(OutputMessage.CONTACT_EMPTY.getMessage());
        } else {
            this.contacts.forEach(Contact::print);
        }
    }

    public void searchContact(String name) {
        boolean isFound = this.contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .peek(Contact::print)
                .count() > 0;

        if (!isFound) {
            System.out.println(OutputMessage.CONTACT_NOT_FOUND.getMessage());
        }
    }
}
