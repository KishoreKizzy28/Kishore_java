package List;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_list {
	 public static void main(String[] args)
	    {
	 
	        
	        ArrayList<Integer> ArrList = new ArrayList<Integer>();
	 
	        
	        ArrList.add(10);
	        ArrList.add(20);
	        ArrList.add(30);
	        ArrList.add(40);
	        ArrList.add(50);
	 
	        
	        System.out.println(" ArrayList : " + ArrList);
	 
	        // create vector and pass the ArrayList in vector
	        // constructor
	        Vector<Integer> vector = new Vector<Integer>(ArrList);
	 
	        // print vector
	        System.out.println(" Vector : " + vector);
	    }
	}


