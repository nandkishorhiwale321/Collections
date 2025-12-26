package PriorityQueue;
import java.util.PriorityQueue;
import java.util.Queue;

public class one {
	public static void main (String [] args) {
		 
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		
		q.offer(15);
		q.offer(1);
		q.offer(55);
		q.offer(15);
		q.offer(6);
		q.offer(65);
		q.offer(85);
		q.offer(25);
		
		
		
		
		System.out.println(q);
		System.out.println("Given size :"+q.size());
		System.out.println("peek of the list/Head :"+q.peek());	
		System.out.println("Removed peek elements using poll:"+q.poll());
		System.out.println("It contains is or not :"+ q.contains(0));
	
		
		System.out.println(q);
		
		System.out.println("Size after oretion :"+q.size());
	
		
		
		
		
	}

}
