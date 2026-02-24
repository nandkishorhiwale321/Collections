package api;

import java.util.Comparator;
import java.util.List;

public class Fifth {
	public static void main (String [] args ) {
		/*
		 * find second max elements.
		 */
		
	Integer a=	List.of(10,1,0,01,66,88,45,32,15)
		.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	
	
	System.out.println(a);
	}

}
