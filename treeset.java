import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        // add elements to the set
        set.add("Hello");
        set.add("World");
        set.add("!");

        // add elements at last
        set.add("last");

        // add elements at first
        set.add("first");

        // display the set    
        System.out.println(set);

        // display the specific element
        System.out.println(set.first());
        System.out.println(set.last());

        // remove the specific element
        set.remove("Hello");
        set.remove("!");
        System.out.println(set);

        // size of the set
        System.out.println(set.size());

        // clear the set
        set.clear();
    }
}
