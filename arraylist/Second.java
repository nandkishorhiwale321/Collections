package arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class Second {
	public static void main (String [] args) {
		/*
		 * Add Array into another Arraylist
		 * 
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		String arr [] ={"ram","shyam","dev"};
		
		list.add("lakhn");
		list.add("raj");
		list.add("Rudra");
		list.add("mahesh");
		
		System.out.println("First Array:"+list);
		list.addAll(Arrays.asList(arr));
		
		System.out.println("Second Array:"+list);
		
	}

}
