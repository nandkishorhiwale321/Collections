package HashSet;
import java.util.*;


public class Third {
	
	public static void main (String [] args) {
		
		Set<Integer> set = new HashSet <Integer>();
		/*
		 * Sorted Output from HashSet
		 * get sorted output from  HashSet by convert it to TreeSet.
		 */
		
		set.add(10);
		set.add(22);
		set.add(10);
		set.add(101);
		
		
		Set<Integer> sortedset = new TreeSet<Integer>(set);
		System.out.println(sortedset);
		
		
		
	}

}
