
package Lecture18;

public class LL {
    

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
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
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    // print list 
    public void print(){

        if (head == null) {
           System.out.println("list is emty");
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            System.out.println(currentNode.data+" - >");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("is");

        list.print();
    }
}
