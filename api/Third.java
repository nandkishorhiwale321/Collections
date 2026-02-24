package api;

import java.util.List;


public class Third {
	public static void main (String [] args) {
		
		List.of("Abc", "abcd", "ghd")
		.stream()
		.map((s)->{return s.length();})
		.forEach((i)-> { System.out.println(i); });

		
		
		
		
	}

}
