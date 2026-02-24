package predicate;

import java.util.function.Predicate;
     public class predicate_and {

	public static void main(String[] args) {
		
		Predicate<Integer> pred=(i)-> {
			
			return i%2==0;
			
		};
		
		Predicate <Integer>p2=(i)-> {
			return i>10;
		};
		
		Predicate<Integer> p3=pred.and(p2);
		System.out.println(p3.test(22));

	}

}
