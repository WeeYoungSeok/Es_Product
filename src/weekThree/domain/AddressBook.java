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
            this.contacts.forEach(System.out::println);
        }
    }

    public void searchContact(String name) {
        boolean isFound = this.contacts.stream()
                .filter(contact -> contact.getName().equals(name))
                .peek(System.out::println)
                .count() > 0;

        if (!isFound) {
            throw new IllegalArgumentException(OutputMessage.CONTACT_NOT_FOUND.getMessage());
        }
    }
}
