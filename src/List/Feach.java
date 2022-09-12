package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Feach {
	public static void main(String[] args) {
		
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("King");
	names.add("queen");
	names.add("Bishop");
	names.add("Joker");
	names.add("Soldiers");
	
	System.out.println(names);
	
	Iterator<String> i = names.iterator();
	while (i.hasNext())
	{
		System.out.println(i.next());
	}
	
	for(String s : names) {
		System.out.println(s);
	}
	
	}
}
