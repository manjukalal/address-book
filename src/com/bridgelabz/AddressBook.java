package com.bridgelabz;
import java.util.*;


public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to address book");
        Contact contact = addContact();
        System.out.println(contact);
        Contact editedContact = editContact(contact);
        System.out.println(editedContact);
    }

    private static Contact addContact() {
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

        return contact;

    }
    private static Contact editContact(Contact contact) {
        System.out.println("Edit first name");
        contact.setFirstname(scanner.next());
        return contact;
    }
}