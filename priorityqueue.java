import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        // add elements to the queue
        queue.add("Hello");
        queue.add("World");
        queue.add("!");

        // add elements at last
        queue.add("last");

        // add elements at first
        queue.add("first");

        // display the queue    
        System.out.println(queue);

        // display the specific element
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        // remove the specific element
        queue.remove("Hello");
        queue.remove("!");
        System.out.println(queue);

        // size of the queue
        System.out.println(queue.size());

        // clear the queue
        queue.clear();
    }
}
