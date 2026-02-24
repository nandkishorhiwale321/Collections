package predicate;

import java.util.function.Predicate;

public class Predicate_negate {
	public static void main(String [] args) {
		/*
		 * negate() is change the answer if ans is true is it change false and ans is false is is change it true
		 */
		
		Predicate<Integer> p=(i)->{
			return i*10==10;
		};
		Predicate<Integer> p2=p.negate();
		System.out.println(p2.test(10));
		
		
	}

}
