package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class First {
	public static void main(String [] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		/*
		 * HashSet is  a class of java collection framework that is used to store a collection of unique elements
		 * its is a part of set interface it does not allow duplicates values
		 * it is  not maintained insertion order
		 * it is faster of add(), remove(), and contains() are o(1)
		 */
		
         set.add(null);
         set.add(65);
         set.add(65);
         set.add(12);
         set.add(58);
         set.add(null);
         set.add(12);
         set.add(45);
         set.add(10);
         set.add(33);
         
         
        
         
         
         System.out.println(set.contains(65));
         
         
         
         System.out.println(set);
         
         Iterator<Integer> it =set.iterator();
         
         while(it.hasNext()) {
        	 
        	 System.out.println(it.next());
        	 
         }
	}

}
