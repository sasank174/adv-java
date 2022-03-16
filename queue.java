import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");

        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.contains("A"));
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.element());


        Iterator<String> it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
