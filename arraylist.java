import java.util.*;

// main function
class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        // display the list    
        System.out.println(list);

        // display the specific element
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // remove the specific element
        list.remove(0);
        list.remove("!");
        System.out.println(list);

        // index of the specific element
        System.out.println(list.indexOf("World"));
        
        System.out.println(list.indexOf(list.get(0)));
        // size of the list
        System.out.println(list.size());

        // clear the list
        list.clear();
    }
}