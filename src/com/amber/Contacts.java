package com.amber;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts extends Phone {
    private ArrayList<String> names = new ArrayList<String>();

    public void addContact() throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scan.nextLine();
            if(name.equals("")) throw new IllegalAccessException("Name cannot be blank");
            names.add(name);
            addNumber();





    }
}
