package Stack;
import java.util.*;

public class Implementation{
    public static void main(String[] args) {
        //Time complexity for Push in stack is O(1);
        // Time complexity for pop in stack is O(1);
        Stack<Integer> stack1 = new Stack<>();
        //push elements inside the stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);

        //Print the top/Peek most element in stack
        System.out.println("The top elem is: "+stack1.peek());

        //Delete/Pop the top elem from the stack
        stack1.pop();
        System.out.println("The top elem is: "+stack1.peek());

        //Search an element in stack
        //it starts from the top position in search location so the indexing starts from 1 not 0 like arrays
        System.out.println("Element 4 is present at position: "+stack1.search(4));
    }
}
