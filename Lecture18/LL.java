
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
            System.out.print(currentNode.data+" - >");
            currentNode = currentNode.next;
        }
        System.out.println("null");

    }


    // delete from list first
    public void deleteItemfirst(){

        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    // delete from list last 
    public void deleteItemlast(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        
        }
        if (head.next==null) {
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }

        secondLast.next=null;
    }


    // Reverce Linked list iterate
     public void reverseList(){

        if (head==null || head.next==null) {
            return;
        }
        Node previousNode=head;
        Node currentNode=head.next;
        
        while (currentNode!=null) {
            Node nextNode=currentNode.next;
            currentNode.next=previousNode;

            // update 
            previousNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=previousNode;
     }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("is");
        list.addFirst("is");
        list.addFirst("is");
        list.addLast("a");
        list.addLast("a");
        list.addLast("a");
        list.addLast("a");
        list.addFirst("a");

        list.deleteItemfirst();
        list.deleteItemlast();


        list.print();

        list.reverseList();

        list.print();
    }
}

