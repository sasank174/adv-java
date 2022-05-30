import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

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
        System.out.println(set.iterator().next());
        System.out.println(set.iterator().next());

        System.out.println("set.hashCode(); " + set.hashCode());

        // remove the specific element
        set.remove("Hello");
        set.remove("!");
        System.out.println(set);

        // size of the set
        System.out.println(set.size());
    }
}
