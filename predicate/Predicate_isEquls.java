package predicate;

import java.util.function.Predicate;

public class Predicate_isEquls {
	
	public static void main(String [] args) {
		Predicate<String> p=Predicate.isEqual("java");
			
			System.out.println(p.test("java"));
			System.out.println(p.test("python"));
	
		}
	

}
