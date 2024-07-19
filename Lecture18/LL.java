
package Lecture18;

public class LL {
Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
// add in the start of linkedlist 
    public void addFirst(String data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

// add in the ending of linkedlist 
public void addLast(String data) {

    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node currentNode=head;
    while (currentNode.next!=null) {
        currentNode=currentNode.next;
    }
    currentNode=newNode;

}
    public static void main(String[] args) {
        LL list = new LL();


        list.addFirst("is");
    }
}
