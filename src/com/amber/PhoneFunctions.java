package com.amber;

import java.util.Scanner;

public class PhoneFunctions {
    public  String menuItems(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to add");
        System.out.println("Press 2 to edit");
        System.out.println("Press 3 to delete");
        System.out.println("Press 4 to see the phone book");
        return scan.nextLine();
    }


    public  void phoneFunction(ContactNames obj) throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);
        while(true){
            String menuChoice = menuItems();
            switch (menuChoice){
                case "1":
                    obj.addContact();
                    break;
                case "2":
                    obj.modifyName();
                    break;
                case "3":
                    obj.removeContact();
                    break;
                case "4":
                    obj.getPhoneBook();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menuChoice);
            }
            System.out.println("Would you like to make another selection?(yes/no)");
            String answer = scan.nextLine();
            if(answer.equals("no")) {
                System.out.println("Thank you.");
                break;
            }
        }
    }
}
