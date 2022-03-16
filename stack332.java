import java.util.*;

public class stack332 {
    public static void main(String[] args) {
        // stack program
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("D");
        stack.push("E");
        stack.push("E");
        stack.push("E");
        stack.push("E");
        stack.push("E");
        stack.push("E");

        // set stack size to 15
        // stack.setSize(15);


        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("capacity: " + stack.capacity());
        System.out.println("size: " + stack.size());
        System.out.println("empty: " + stack.isEmpty());
    }
}
