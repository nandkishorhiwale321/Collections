package arraylist;

import java.util.ArrayList;

public class Demo {
	public static void main (String [] args) {
		ArrayList<String> list =new  ArrayList<>();
		list.add("acd");
		list.add(null);
		list.add("abc");
		list.add("abb");
		list.add("abc");
		
		
		System.out.println(list);
		System.out.println(list.get(3));
		
		
		
		System.out.println(list);
	}

}
