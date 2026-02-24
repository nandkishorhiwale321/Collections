package predicate;

import java.util.function.Predicate;

public class Predicate_or {

	public static void main(String[] args) {
		
		
		Predicate<String>p=(s)->{
			return s.startsWith("A");
		};
         
		Predicate<String>p2=(s)->{
			
			return s.length()==10;
		};
		Predicate<String>p3=p.or(p2);
		System.out.println(p3.test("Abc"));
	}

}
