import java.util.*;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //to add new element in the stack
    //Time complexity : O(n)
    static void add(int data){
        //1. Move all the elements fro q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();//poll method is used to remove the element from que
        //only difference is it returns null when queue is empty
        }

        //2. Push new data to q1
        q1.add(data);

        //3. Move back all the elements from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    //To delete the element from the stackk
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue underflow");
            System.exit(0);
        }

        int element = q1.peek();
        q1.poll();
        return element;
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(12);

        System.out.println("Deleted element from the stack is: "+s.remove());
    }
}
