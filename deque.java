import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();

        // add elements to the deque
        deque.add("Hello");
        deque.add("World");
        deque.add("!");

        // add elements at last
        deque.addLast("last");

        // add elements at first
        deque.addFirst("first");

        // display the deque    
        System.out.println("deque");
        System.out.println(deque);

        // display the specific element
        System.out.println(deque.iterator().next());
        System.out.println(deque.iterator().next());

        // remove the specific element
        deque.remove("Hello");
        deque.remove("!");
        System.out.println(deque);

        // offer the specific element
        deque.offer("Hello");
        deque.offerFirst("end");
        System.out.println(deque);

        // size of the deque
        System.out.println(deque.size());
    }
}
