package Linked_list;


// import java.util.LinkedList;

public class ReverseRecursion {
    Node head;
    
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    //Implementation of insertion of a node at the end
    public void insertAtEnd(int newData){
        Node newNode = new Node(newData);
        //if LL is empty
        if(head == null){
            head = new Node(newData);
        }

        //not empty
        newNode.next = null;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }
    //implementation of reversal of a linked list using a recursive
    public void ReversalRec(Node curr, Node prev){
        //Last node of a linked list
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        }

        Node nextPtr = curr.next;
        curr.next = prev;
        //Recursive function call
        ReversalRec(nextPtr, curr);
    }

    //Displaying the linked list
    public void displayLL(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        ReverseRecursion list = new ReverseRecursion();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);

        System.out.println("Before insertion of 10 ");
        list.displayLL();
        System.out.println();

        list.insertAtEnd(10);
        System.out.println("After insertion of 10 ");
        list.displayLL();

        list.ReversalRec(list.head, null);
        list.displayLL();
    }
   
}
