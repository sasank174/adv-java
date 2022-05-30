import java.util.*;

class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Hello");
        list.add("World");
        list.add("!");
        list.addLast("last");
        list.addFirst("first");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // remove the specific element
        list.remove(0);
        list.remove("!");
        System.out.println(list);

        // index of the specific element
        System.out.println(list.indexOf("World"));

        // index from last
        System.out.println(list.lastIndexOf("World"));

        // size of the list
        System.out.println(list.size());

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // peek
        System.out.println(list.peek());

        // clear the list
        list.clear();
    }
}