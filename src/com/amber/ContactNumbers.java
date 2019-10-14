package com.amber;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactNumbers {
    private ArrayList<String> phoneNumbers = new ArrayList<String>();

    //@ADD
    public void addNumber() throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number:");
        String newNumber = scan.nextLine();
        if(newNumber.equals("")) throw new IllegalAccessException("Number cannot be blank");
        phoneNumbers.add(newNumber);
        System.out.println("Succesfully added!");
    }
    //@does this contain
    private boolean containingNumber(String number){
       return phoneNumbers.contains(number);

    }
    //@ MODIFY
    public void modifyNumber(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Please enter the number to modify: ");
            String currentNumber = scan.nextLine();
            if(containingNumber(currentNumber)){
                System.out.print("Enter updated number: ");
                String newNumber = scan.nextLine();
                int index = phoneNumbers.indexOf(currentNumber);
                phoneNumbers.set(index, newNumber);
                System.out.println("Number Updated!");
                break;
            }
            System.out.println("404 Number Not found");
        }
    }

    public void removeNumber(int index){
        phoneNumbers.remove(index);
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
