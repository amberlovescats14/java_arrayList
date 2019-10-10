package com.amber;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private ArrayList<String> phoneBook = new ArrayList<String>();

    public void addNumber(String newNumber){
        phoneBook.add(newNumber);
        System.out.println("New number added.");
    }
    private boolean containing(String number){
       return phoneBook.contains(number);

    }

    public void modify(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Please enter the number to modify: ");
            String currentNumber = scan.nextLine();
            if(containing(currentNumber)){
                System.out.println("Enter updated number: ");
                String newNumber = scan.nextLine();
                int index = phoneBook.indexOf(currentNumber);
                phoneBook.set(index, newNumber);
                System.out.println("Number Updated!");
                break;
            }
            System.out.println("404 Number Not found");
        }
    }




}
