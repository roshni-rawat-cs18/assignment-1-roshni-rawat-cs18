package personContact;

import conactDisplay.Node;

public class LinkedList1 {
    person person;
    private Node first;
    private Node last;

    public void addlast(person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }

    }

    public void addFirst(person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            node.setNext(first);
            first = node;
        }
    }

    public boolean isEmpty() {
        boolean response = false;
        if (first == null) {
            response = true;
        }
        return response;
    }

    public boolean exist(string firstName) {
        if (indexOf(firstName) != -1) {
            return true;
        }
        return false;
    }

    public int indexOf(String firstName) {
        Node currently = first;
        int response = 0;
        while (currently != null) {
            if (currently.getValue().getFirstName().equals(firstName)) {
                return response;
            }
            response++;
            currently = currently.getNext();
        }
        return -1;
    }

    public void removeFirst() {
        if (first == last) {
            first = null;
            last = null;
        } else {
            Node second = first.getNext();
            first = second;
        }
    }

    public void removeLast() {
        var previousNode = getPreviousNode(last);
        last = previousNode;
        last.setNext(null);
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current.getNext() != null) {
            if (current.getNext() == node) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteNode(int position) {
        if (position == 0) {
            first = temp.getNext();
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.getNext();
        if (temp == null || temp.getNext() == null)
            return;
        Node next = temp.getNext().getNext();
        temp.setNext(next);
    }
    public int size(){
        var index = first;
        int index = 1;
        while(current.getNext() !=null){
            current = current.getNext();
            index++;
        }
        return index;
    }
    public void display(){
        System.out.println("---------------*------------");
        System.out.println("Name :"+current.getValue().getFirstName()+ " "+ current.getValue().getLastName());
        System.out.println("Contacts :"+current.getValue().getMob().toString());
        System.out.println("Email:"+current.getValue().getEmailId());
        System.out.println("----------------*--------------");
        System.out.println();
        current = current.getNext();
    }
    public void getNode(int pos){
        var current = first;
        int index = 0;
        while(current !=null){
            if(current !=null){
                System.out.println();
                System.out.println("-------------------*-------------------");
                System.out.println("Name:"+current.getValue().getFirstNme()+" "+current.getValue().getLastName());
                System.out.println("Contacts:"+current.getValue().getMob().toString());
                System.out.println("Email :" +current.getValue().getEmaiId());
                System.out.println("---------------------*-------------------");
                System.out.println();
                break;

            }
            index++;
            current = current.getNext();
        }
    }

}
