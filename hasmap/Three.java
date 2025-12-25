package hasmap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class Three {
	public static void main (String [] args) {
		
		/*
		 * check the frequency of a each character in given string
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter :");
		String st = sc.next();
		String str = "nandkishor";
		char  [] ch = st.toCharArray();
				
//		for(int i =0; i<=str.length();i++) {
//			char ch = str.charAt(i);
//			System.out.println(ch); 
//	
//		}
		
		
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(char c :ch) {
			//System.out.println(c);
			int Frequency = 1;
			
			if(map.containsKey(c)) {
				Frequency=map.get(c)+1;     //{a=1, r=1, s=1, d=1, h=1, i=1, k=1, n=2, o=1}
				//Frequency++;
			}
			
			map.put(c, Frequency);
			
			
		}
		System.out.println(map);
		System.out.println("Total Character :"+map.size());
		
		
			
			
	
	
	}
	
}

