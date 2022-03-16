import java.util.Queue;

public class queues {
    public static void main(String[] args) {
        Queue<String> q = new Queue<String>();
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");
        q.add("F");
        q.add("G");

        System.out.println("The elements in the queue are " + q);
        System.out.println("The size of the queue is " + q.size());
        System.out.println("The elements in the queue are " + q.remove());
        

        // queue clear
        q.clear();
        // forloop add elements
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
    }
}
