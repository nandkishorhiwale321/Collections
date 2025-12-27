package Deque;
import java.net.MulticastSocket;
import java.util.ArrayDeque;

public class one {
	public static void main (String [] args) {
		
		
         ArrayDeque<Integer> ar = new ArrayDeque <Integer>();
         
         ar.add(10);
         ar.add(89);
         ar.add(6);
         ar.add(20);
         ar.add(1);
         ar.add(2);
         ar.add(65);
         ar.add(65);
         
         
         System.out.println("Given list :"+ar);
         
         System.out.println("Starting size :"+ar.size());
         
         ar.addFirst(01);
         
         System.out.println("Add first :"+ar);
         
         ar.addLast(2);
         
         System.out.println("Add last :"+ ar);
         
        //System.out.println(ar.stream());
         
         System.out.println("Get first/ Head in the Deque :"+ar.getFirst());
         
         System.out.println("Get last/ Tail in the Deque :"+ar.getLast());
         
        
         System.out.println(ar.poll());
         
         System.out.println("End size :"+ar.size());
         
         System.out.println(ar);
	}

}
