package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Second {
	public static void main (String [] args) {
		
		Deque <Integer> dq =new ArrayDeque<>();
		
		dq.add(1);
		dq.add(4);
		
		dq.offer(2);
		dq.add(65);
		
		
		System.out.println(dq);
		System.out.println(dq.removeLast());
	}

}
