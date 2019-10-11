package com.amber;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts extends Phone {
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<String> numbers = new ArrayList<String>();

    //add
    public void addContact() throws IllegalAccessException {
        System.out.println("___New Contact___");
        Scanner scan = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scan.nextLine();
            if(name.equals("")) throw new IllegalAccessException("Name cannot be blank");
            names.add(name);
            addNumber();
    }
    //edit
    private boolean containingName(String name){
        return names.contains(name);
    }
    public void modifyName(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Which name would you like to update?");
            String answer = scan.nextLine();
            if(containingName(answer)){
                System.out.print("Updated name: ");
                String updated = scan.nextLine();
                int index = names.indexOf(answer);
                names.set(index, updated);
                System.out.println("Name updated!");
                break;
            }
            System.out.println("404 Name not found");
        }
    }
    //remove
    public void removeContact(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Who would you like to remove?");
            String name = scan.nextLine();
            if(containingName(name)){
                int index = names.indexOf(name);
                names.remove(index);
                removeNumber(index);
                System.out.println("Contact Removed");
                break;
            }
            System.out.println("404 Contact not found");
        }
    }

    public void getPhoneBook(){
        this.numbers = getPhoneNumbers();
        for(int i=0; i<names.size(); i++){
            System.out.println("Name: " + names.get(i) + ", Number: " + numbers.get(i));
        }

    }

}
