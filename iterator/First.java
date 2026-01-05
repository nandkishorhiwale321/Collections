package iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



public class First {
	public static void main (String [] args) {
		
		List<Integer> list = new ArrayList <Integer>();
		
		list.add(11);
		list.add(null);
		list.add(20);
		list.add(01);
		list.add(30);
		
		
		System.out.println(list);

		
		ListIterator <Integer> itr    =list.listIterator();
		
		while(itr.hasNext()) {
			
		
			Integer val = itr.next();
			
			if(val != null && val == 30) {
				
	          itr.add(val);
				
			
				
			}
		}
		System.out.println(list);
		
	}

}
