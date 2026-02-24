package stack;

import java.util.Stack;

public class Third {
	public static void main(String [] args) {
		
		Stack <Integer> stack =new Stack<>();
		
		stack.add(1);
		stack.add(null);
		stack.add(2);
		stack.add(12);
		stack.add(56);
		stack.add(0);
		stack.add(null);
		stack.add(222);
		
		
		System.out.println(stack);
		
		System.out.println(stack.capacity());
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}

}
