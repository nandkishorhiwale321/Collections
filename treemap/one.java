package treemap;

import java.util.*;


public class one {
	public static void main (String [] args) {
		
		
	
	
	Integer arr [] = {1,3,2,6,5,6,8,9,22,5854,632,96,25,665,6,522,62,685,622,5,33,22,51};
	
	List<Integer> list = Arrays.asList(arr);
	Collections.sort(list);
	
	System.out.println(list);
	
	int index = Collections.binarySearch(list, 22);
	
	System.out.println("Index of 22 :"+index);
	
	System.out.println("First index :"+list.getFirst());
	
	
	System.out.println("Last Elements :"+list.getLast());
	
	int Minimum_Elements = Collections.min(list);
	
	System.out.println("Minimum Elements  :"+Minimum_Elements);
	
	int Max = Collections.max(list);
	
	System.out.println("Maximum Elements  :"+Max);
	
	Collections.shuffle(list);
	
	System.out.println(list);
	}
}
