package arraylist;


import java.util.ArrayList;

public class First {
	
	public static void main (String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("*-*-*-*-ArrayList Mathods-*-*-*-*");
		
		System.out.println("1. Given List:"+list);
		//System.out.println("2. Updated List:"+list);
		
		list.add(1, 10);
		
		System.out.println("3. Get First:"+list.getFirst());
		list.addLast(30);
		System.out.println("4. Revesed Array:"+list.reversed());
		System.out.println(list.addAll(5, list));
		System.out.println("2. Updated List:"+list);

		
		
	}

}
