import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();


        // add elements to the set
        set.add("Hello");
        set.add("World");
        set.add("!");


        // display the set
        System.out.println(set);
        System.out.println(set.contains("World"));
        System.out.println(set.contains("!"));
        System.out.println(set.contains("last"));
        System.out.println(set.contains("first"));
        System.out.println(set.size());
        set.remove("Hello");
        set.remove("!");
        System.out.println(set);
        set.clear();
    }
}
