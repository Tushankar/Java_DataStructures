package Linked_list;

// import java.util.LinkedList;

public class Deletion{
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

    
    //implementing of insertion of a node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //implementaion of insertion of a node after any node
    public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The prev node cannot contain null value");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    //Deletetion of any particular node in a linked list
    void deleteNode(int position){
        //LinkedList is empty
        if(head == null){
            return;
        }

        Node temp = head;
        //Deletion is in the beginning of the node
        if(position == 0){
            head = temp.next;
            return;
        }
        //if deletion is not in the begining of the node
        for(int i = 0; temp!=null && i<position-1; i++){
            temp = temp.next;
        }

        // if(temp == null && temp.next ==null){
        //     return ;
        // }

        temp.next = temp.next.next;
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
        Deletion list = new Deletion();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);

        System.out.println("Before insertion of 10 ");
        list.displayLL();
        System.out.println();

        list.insertAtEnd(10);
        System.out.println("After insertion of 10 ");
        list.displayLL();
        System.out.println();

        list.insertAfter(list.head.next.next, 13);
        list.displayLL();
        System.out.println();

        list.deleteNode(3);
        list.displayLL();

    }
   
}

