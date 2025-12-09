package arraylist;
import java.util.ArrayList;

public class Five {
	public static void main (String [] args) {
		/*
		 * Create an ArrayList of Strings and add 5 names and print all names using a loop
		 */
		
	ArrayList<String> s = new ArrayList<String>();
	
	s.add("Nandkishor");
	s.add("Manish");
	s.add("Lalit Sir");
	s.add("prasant ");
	s.add("karran");
	
	for(int i=0;i<s.size();i++) {
		System.out.println(s.get(i));
	}
	
	
	
	
	}

}
