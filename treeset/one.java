package treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class one {
	public static void main (String [] args) {
		
		List <Integer> list = List.of(10,20,15,10,22,33,20,54,01);
		
		
		Set<Integer> set = new TreeSet();
         set.addAll(list);		
         System.out.println(list);
		System.out.println(set);
	}

}
