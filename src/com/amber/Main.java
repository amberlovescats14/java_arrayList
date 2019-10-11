package com.amber;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        var myPhoneBook = new Contacts();
        myPhoneBook.addContact();
        myPhoneBook.addContact();
        myPhoneBook.modifyName();
        myPhoneBook.addContact();
    }
}
