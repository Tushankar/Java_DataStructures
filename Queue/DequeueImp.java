import java.util.*;

public class DequeueImp {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(6);
        deque.addFirst(7);

        System.out.println("Deque output looks like "+deque);
            
       
    }
}
