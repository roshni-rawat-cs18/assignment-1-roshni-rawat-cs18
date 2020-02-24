package main;

import conactDisplay.Contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact con = new Contact();
        String ch = sc.next();
        String ch1 = sc.next();
        int press = sc.nextInt();
        switch(press) {
            case 1:
                try {
                    System.out.println("you have chosen to add a new contact");
                    System.out.println("please enter the name of the person");
                    System.out.println("firstName");
                    String firstName = sc.nextLine();
                    System.out.println("");
                    System.out.println("lastname");
                    String lastName = sc.nextLine();
                    String emailId = "";
                    long mob;
                    System.out.println("");
                    System.out.println("conatct number");
                    do {
                        mob = sc.nextLong();
                        System.out.println("wouid you like to add another contact number ?(y/n); ");
                    }
                    while (ch.equals("y"));
                    if (ch == "n") {
                        System.out.println("would you like to add email address?(y/n); ");
                        if (ch == "y") {
                            emailId = sc.nextLine();

                        } else {
                            System.out.println("");
                            System.out.println("Contact Number");
                            do {
                                mob = sc.nextLong();
                                System.out.println("would you like to add another contact number(y/n); ");
                            }
                            while (ch.equals("y"));
                            if (ch == "n") {
                                System.out.println("would you like to add email address?; ");
                                if (ch1 == "y") {
                                    emailId = sc.nextLine();
                                } else {
                                    System.out.println("");
                                }
                            }
                            con.add(firstName, lastName, mob, emailId);
                            System.out.print(con);
                            break;
                        }

                    }
                } catch (Exception e) {
                    System.out.println("");
                }
        }
    }
}
