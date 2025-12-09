package arraylist;
import java.util.ArrayList;

public class Sixth {
	public static void main (String [] args) {
		
		/*
		 * Given is ArrayList<Integer>, remove all occurrences of the number 3
		 *
         */
		
		ArrayList<Integer> i =new ArrayList<Integer>();
		
		i.add(3);
		i.add(6);
		i.add(8);
		i.add(3);
		i.add(9);
		i.add(3);
		
		System.out.println("Given ArrayList :"+i);
	
		
		
		
		for (int s=0; s<i.size();s++) {
			
			if(i.get(s)==3) {
				i.remove(s);
				
			}
		}
		
		System.out.println("Final ArrayList :"+i);
		
	}

}
