import java.util.*;

public class QueueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    
    //insertion of the data in the queue
    //time complexity : O(1)
    static void enQue(int data){
        stack1.push(data);
    }

    //deletion of the data from the queue
    static int deQueue(){
        int element;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        //push all the elements from 1 stack to 2
        if(stack2.empty()){
            while(!stack1.empty()){
                element = stack1.pop();
                stack2.push(element);
            }
        }

        //we have pop the top most element from stack 2
        element = stack2.pop();
        return element;

    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        //function calling for insertion
        q.enQue(1);
        q.enQue(2);
        q.enQue(3);
        q.enQue(4);

        //function calling for deleteion 
        System.out.println("Deleted element is  " +q.deQueue());
    }
}
