package com.amber;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private ArrayList<String> phoneBook = new ArrayList<String>();

    //@ADD
    public void addNumber(String newNumber){
        phoneBook.add(newNumber);
        System.out.println("New number added.");
    }
    //@does this contain
    private boolean containing(String number){
       return phoneBook.contains(number);

    }
    //@ MODIFY
    public void modify(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Please enter the number to modify: ");
            String currentNumber = scan.nextLine();
            if(containing(currentNumber)){
                System.out.print("Enter updated number: ");
                String newNumber = scan.nextLine();
                int index = phoneBook.indexOf(currentNumber);
                phoneBook.set(index, newNumber);
                System.out.println("Number Updated!");
                break;
            }
            System.out.println("404 Number Not found");
        }
    }

    public void remove(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Please enter the number to delete: ");
        String currentNumber = scan.nextLine();
            if(containing(currentNumber)){
                int index = phoneBook.indexOf(currentNumber);
                phoneBook.remove(index);
                System.out.println("Number Deleted");
                break;
            }
            System.out.println("404 Number Not found");
        }
    }

    public ArrayList<String> getPhoneBook() {
        return phoneBook;
    }
}
