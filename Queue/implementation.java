import java.util.LinkedList;
import java.util.*;

public class implementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //Add the data inside the queue
        for(int i=0; i<10; i++){
            q.add(i);
        }

        System.out.println("Queue Data looks like : " +q);

        //to remove the element from the queue
        q.remove();

        //to display the top element present in the queue
        System.out.println("The top element in queue after the deletion is: "+q.peek());


    }
}
