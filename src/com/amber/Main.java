package com.amber;

public class Main {

    public static void main(String[] args) {
        var myPhoneBook = new Phone();
        myPhoneBook.addNumber("210-429-6474");
        myPhoneBook.addNumber("210-705-9770");
        myPhoneBook.modify();
        myPhoneBook.remove();
        System.out.println(myPhoneBook.getPhoneBook());
    }
}
