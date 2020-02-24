package main;

import conactDisplay.Contact;
import personContact.LinkedList1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList1 linkedList1 = new LinkedList1();
        Contact con = new Contact();
        System.out.println("press 1 to add a new contact");
        System.out.println("press 2 to view a new contact");
        System.out.println("press 3 to search for a contact");
        System.out.println("press 4 to delete contact");
        System.out.println("press 5 to exit program");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice ==1) {
            con.add(linkedList1);
            choice = Integer.parseInt(sc.nextLine());
        }
        if(choice == 3){
            con.search(linkedList1);
            choice = Integer.parseInt(sc.nextLine());

        }

    }
}

