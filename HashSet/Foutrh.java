package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Foutrh {
	public static void main (String [] args) {
		 int arr [] = {0,20,15,10,10,22,33,20,54,01};
		 
		 Set <Integer> dup = new HashSet<>();
		 Set <Integer> fi = new HashSet<>();
		 
		 for(int num :arr) {
			 if(!dup.add(num)) {
				 fi.add(num);
			 }
			 
			 
		 }
		 System.out.println(fi);
	}

}
