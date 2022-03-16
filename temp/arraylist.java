package temp;

import java.util.*;

class arraylist{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
        list.add(4);
        list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
        list.add(9);
        list.add(10);

        
		System.out.println(list);
		
		
		System.out.println(list.get(0));
		
		list.remove(0);
		list.remove(5);
		
		System.out.println(list);
		
		System.out.println(list.indexOf(3));
		
		System.out.println(list.size());

        System.out.println(list.isEmpty());

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(list.contains(3));

		list.clear();
		
	}
}