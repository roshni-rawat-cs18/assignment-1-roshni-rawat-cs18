package conactDisplay;

import java.util.Scanner;

public class Contact {
    Scanner sc= new Scanner(System.in);
    LinkedList<String>linkedList = new LinkedList<>();
    public void add(another calss name){
        System.out.println("you have chosen to add a new contact : \n" + "pleasw enter the name of the prson");
        System.out.println("First Name");
        String firstName = sc.nextLine().trim();
        while(true){
            if(firstName.matches("[A-Za-z]+")){
                break;
            }
            else{
                System.out.println("plese enter correct Name");
            }
            firstName = sc.nextLine().trim();
        }
        System.out.println("Last Name :");
        String lastName = sc.nextLine().trim();
        while(true){
           if(lastName.matches("[A-Za-z]+")){
               break;
           }
           else{
               System.out.println("please enter correct Name");
           }
           lastName = sc.nextLine().trim();
        }
        System.out.println("Phone number :");
        while(true){
            System.out.println("would you like to add another Contact number?(y/n):");
            char choice = sc.next().charAt(0);
            if(choice == 'y'){
                System.out.println("phone number");
                break;
                else{
                    System.out.println("Add correct number");
                }

            }
            else{
                break;
            }
        }
        System.out.println("Enter your email  address:");
        sc.nextLine();
        while(true){
            String temp = sc.nextLine();
            if(temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")){
               linkedList1.addLast(new person(firstName,lastName,linkedList,temp));
               break;
            }
            else{
                System.out.println("invalid email address ! enter again ");
            }
        }
    }
    public void view(LinkedList1 linkedList1){
        System.out.println("---here are all your contacts---");
        if(!linkedList1.isEmpty()){
            linkedList1.display();
        }
        else{
            System.out.println("No result found");
        }
    }
    public void delete(LinkedList1 linkedList1){
        if(!linkedList1.isEmpty()){
            System.out.println("here are all the contacts : press the number against" + "to delete the contacts.");
            linkedList1.displayOne();
            int choice = sc.nextInt();
            sc.nextLine();
            linkedList1.deleteNode(choice);
            linkedList1.displayOne();
            System.out.println("delete...!!");
            else{
                System.out.println("No contacts. you must need  to add contacts before you delete..");
            }
        }
        public void search(LinkedList1 linkedList1){
            System.out.println("you could search contacts from their first name : ");
            String firstName = sc.nextLine().trim();
            if(linkedList1.indexOf(firstName));
        }
        else{
            System.out.println("No match found");
        }
    }
}

