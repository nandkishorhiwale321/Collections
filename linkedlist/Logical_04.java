package linkedlist;
import java.util.Collections;

import java.util.LinkedList;

public class Logical_04 {
	public static void main (String [] args) {
		/*
		 * Input List :[111, 2341, 1011, 7761, 9999, null, 6679, 1143, 143, 691, 69]
		 * 
		 * i want out only start with 0 at index 1
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList <Integer> list2 = new LinkedList<>();
		
		Collections.addAll(list, 111,2341,1011,7761,9999,null,6679,1143,143,691,69);
		
		System.out.println("Input List :"+list);
		
		for( Integer v : list) {
			
			if(v!=null && v.toString().startsWith("1")) {
				
				list2.add(v);
				
			}
		}
		
		System.out.println("\nOutput :"+list2);
		
	}
}