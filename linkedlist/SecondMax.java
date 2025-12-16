package linkedlist;
import java.util.ArrayList;

import java.util.Collections;

public class SecondMax {
	public static void main (String [] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		Collections.addAll(a, 12,32,55,5,64,5,0 ,99,154,22,10,54);
		
		
	int max =a.get(0) ;
	for(int i=0; i<a.size();i++) {
		if(max<a.get(i)) {
			max=a.get(i);
			a.getLast();
			
		}	
		}
	System.out.println(max);
	}

}
