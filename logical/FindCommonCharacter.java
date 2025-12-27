package logical;

public class FindCommonCharacter {
	public static void main (String [] args) {
		
		String str1 = "dabch";
		String str2 = "deabcdd";
		String str3 = "hasabcs";
		
		
		String rev ="";
		
		for(int i= 0; i<str1.length();i++) {
			
			char ch = str1.charAt(i);
			
			if(str2.indexOf(ch)!= -1 && str3.indexOf(ch)!=-1) {
				
				System.out.print(ch);
				
			}
		}
	}

}
