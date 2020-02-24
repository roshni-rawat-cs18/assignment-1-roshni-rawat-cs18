package conactDisplay;
import

public class Node {
   private person value;
   private  Node next;
   public Node(person value){
   this.value = value;}

    public person getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(person value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}