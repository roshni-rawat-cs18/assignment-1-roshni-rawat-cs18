package conactDisplay;

public class Node {
    Node head;
    public String firstName,lastName,emailId;
    public long mob;
    private Node next;
    public Node(String firstName,String lastName,long mob,String emailId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mob = mob;
        this.emailId = emailId;
        setNext(null);
    }
    public Node getNext(){
        return next;
    }

    private void setNext(Node next) {
        this.next = next;
    }

}
