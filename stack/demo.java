package stack;

import java.util.Stack;

public class demo {
	public static void main (String [] args) {
		Stack<Integer> s = new Stack<>();
		s.add(1);
		s.add(2);
		s.add(6);
		s.add(2);
		s.add(66);
		
		
		System.out.println("Given list "+s);
		
		System.out.println(s.capacity());
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		System.out.println(s);
		
		
	}

}
