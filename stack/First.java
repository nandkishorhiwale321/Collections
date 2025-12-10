package stack;
import java.util.*;


public class First {
	public static void main (String [] args) {
		
		Stack<Integer> list = new Stack <Integer>();
		/*
		 * Stack is work on last in first out
		 * 
		 * 1. peek get a current head
		 * 2. pop remove current head
		 * 3. push add element as current add.
		 * 
		 */
	
		
		Collections.addAll(list,10,15,66,88,6,45,301,94,65,75,50,90,14,85,02,32);
		System.out.println(list);
		
		list.pop();
		
		System.out.println(list);
		
		list.push(1);
		
		System.out.println(list);
		
		System.out.println(list.peek());
		
	}
	

}
