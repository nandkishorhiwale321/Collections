package linkedlist;
import java.util.*;

   public class Five {
	   
	  public static void main (String [] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, null,01,01,33,3,05,3,10,2,13,21,25,null);
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.addAll(list);
		
		System.out.println("Origanal list :"+list);
		System.out.println("Removed Elements list :"+set);
	}
	
 
}
