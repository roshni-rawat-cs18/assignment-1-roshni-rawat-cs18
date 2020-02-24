package conactDisplay;

public class Contact {
    Node head;
    public void add( String firstName,String lastName,long mob,String emailId) {
        Node node = new Node(firstName, lastName, mob, emailId);
        //checking head is null or not
        if (head == null) {
            head = node;
        }
        else{
            Node temp = head;
            //a oop reach end of linked list
            while(temp.getNext()!=null){
                //if next node is available updating temp to refer next node
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }



}
