package logical;

public class ReverseString {
	public static void main (String args []) {
		
		String str1 = "abc";
		String str2 = "deabc";
		String str3 = "hsdabc";
		
		String rev ="";
		
		for(int  i=str2.length()-1;i>=0;i--) {
		
		rev = rev+str2.charAt(i);
	}
		System.out.println(rev);
	}
	
}
