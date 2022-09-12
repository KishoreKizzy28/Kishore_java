package List;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	public static void main(String[] args) {
		List<Integer>li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(55);
		li.add(85);
		
		System.out.println(li);
		
		//size
		int size = li.size();
		System.out.println(size);
		
		//get
		Integer get = li.get(5);
		System.out.println(get);
		
		//contains
		boolean contains = li.contains(25);
		System.out.println(contains);
		
		//remove
		li.remove(1);
		System.out.println(li);
		
		//index of
		Integer ind = li.indexOf(85);
		System.out.println(ind);
		
		//set
		li.set(0, 5);
		System.out.println(li);
		
	
		
		
		
		
	}

}
