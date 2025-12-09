package linkedlist;
import java.util.LinkedList;

public class Four {
	public static void main (String [] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		/*
		 * Linked list methods
		 * 
		 */
		
		a.add(18);
		a.add(55);
		a.add(65);
		a.add(69);
		
		System.out.println("Given Linked List is ; "+a);
		
		a.addFirst(66);
		System.out.println("Upadated list after adding element :"+a);
		
		
		System.out.println("Remove specific index :"+a.remove(0)); 
		System.out.println("Updated list :"+a);
		
		System.out.println("Remove object :"+a.remove(Integer.valueOf(69)));
		System.out.println("Final list :"+a);
	}

}
