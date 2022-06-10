package com.bridgelabz;
import java.util.*;


public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact[] contacts = new Contact[3];
    public static void main(String[] args) {

        boolean isExit = false;
        while (!isExit) {
            System.out.println("Please select options\n1. add contact\n2. edit contact\n3. delete contact\n4. exit");
            int choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    addContact();
                    System.out.println(Arrays.toString(contacts));
                    break;
                case 2:
                    System.out.println("Enter name to edit");
                    String name = scanner.next();
                    int contactIndex = findContactByName(name);
                    System.out.println(contactIndex);
                    if (contactIndex == -1) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        Contact contact = editContact(contacts[contactIndex]);
                        contacts[contactIndex] = contact;
                    }
                    showcontact();
                    break;
                case 3:
                    System.out.println("Enter name to delete");
                    name = scanner.next();
                    int contactIndexForDelete = findContactByName(name);
                    if (contactIndexForDelete < 0) {
                        System.out.println("Contact not found with name: " + name);
                    } else {
                        contacts[contactIndexForDelete] = null;
                    }
                    showcontact();
                    break;
                case 4:
                    isExit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please select valid input");
            }
        }

        System.out.println("Welcome to address book");
        Contact contact = addContact();
        System.out.println(contact);
        Contact editedContact = editContact(contact);
        System.out.println(editedContact);
    }

    public static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter first name:");
        contact.setFirstname(scanner.next());
        System.out.println("Enter last name:");
        contact.setLastname(scanner.next());
        System.out.println("Enter address:");
        contact.setAddress(scanner.next());
        System.out.println("enter city");
        contact.setCity(scanner.next());
        System.out.println("enter state");
        contact.setState(scanner.next());
        System.out.println("enter zipcode");
        contact.setZipcode(Integer.parseInt(scanner.next()));
        System.out.println("enter email");
        contact.setEmail(scanner.next());
        System.out.println("enter phone number");
        contact.setMobile(Integer.parseInt(scanner.next()));
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                System.out.println("Contact added successfully");
                return contact;
            }
        }
        System.out.println("No space for new contact");
        return contact;
    }

    public static Contact editContact(Contact contact) {
        System.out.println("Edit first name");
        contact.setFirstname(scanner.next());
        return contact;
    }
    public static int findContactByName(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getFirstname().equals(name) ||
                        contacts[i].getLastname().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void showcontact (){
        for (int i=0;i<contacts.length;i++){
            System.out.println(contacts[i]);
        }
    }
}


