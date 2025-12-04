package linkedlist;
import java.util.LinkedList;

public class First {
	public static void main (String [] args) {
		
		LinkedList <String> list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Jackfruits");
		list.add("Mango");
		list.add("WaterMelon");
		
		System.out.println("Given List:"+list);
		
		System.out.println("Element At Index 3 :"+list.get(3));
		
		
		
		list.addFirst("Lemon");
		list.add(2, "Strawberry");
		System.out.println("updated list:"+list);
	     
		
		
	}

}
