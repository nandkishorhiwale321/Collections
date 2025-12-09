package arraylist;
import java.util.ArrayList;

public class MaxElement {
	public static void main (String [] args) {
	/*
	 * Find maximum element without using collectins.max
	 */
		
		ArrayList<Integer> a = new ArrayList<Integer>();

		a.add(3);
		a.add(6);
		a.add(8);
		a.add(3);
		a.add(9);
		a.add(62);
		a.add(3);
		a.add(69);
		a.add(86);
		a.add(13);
		a.add(90);
		a.add(003);
		
		System.out.println("Given arraylist :"+a);
		
		int max =a.get(0);
		
		for (int i=0; i<a.size(); i++) {
			
			if(max<a.get(i)) {
		     max =a.get(i);
				
				
			}
			
		}
		
		
		System.out.println("Maximum elements of an array list is : "+max);
	}
}
