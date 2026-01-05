package iterator;
import java.util.ArrayList;
import java.util.Iterator;


public class Second {
	public static void main (String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(02);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(list);
		
	Iterator<Integer>	itr =list.iterator();
		
	while(itr.hasNext()) {
		
		Integer it = itr.next();
		
	//	System.out.println(itr.next());
		
//		if(it != null && it == 10) {
//			itr.remove();
//			
		
		System.out.println(itr.next());
	}
//System.out.println(list);
}
}