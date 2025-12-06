package logical;


public class One {
	public static void main (String [] args) {
		
     /*
      * 1. Find the total length of the given String count with " " blank space.
      * 2. Find the total length of the given String count without " " blank space
      */
		
		String s = "My is name is nandkishor ganesh hiwale";
		
		int withcount = 0;
		
		int withoutcount =0;
		
		
		for(int i =0; i<s.length(); i++) {
		
		withcount++;
		
	
	}
	    System.out.println("Length of String with blank space :"+withcount);
	    
	    for(int v =0; v<s.length(); v++) {
	    	
	    	if(s.charAt(v)!=' ') {
	    		
	    withoutcount++;
	    	}
	    }
	    
	    System.out.println("length of String without blank space :"+withoutcount);
}
}
