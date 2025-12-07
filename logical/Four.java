package logical;

public class Four {
	public static void main (String [] args) {
		
		/*
		 * Count the digit in X 
		 * and sum of the digit
		 */
		
		int x = 124567;
		
		int counter = 0;
		int sum =0;
		
		while(x!=0) {
			int y =x%10;
			
			sum =sum+y;
			counter++;
			x=x/10;
			
			
			
		
		}
		System.out.println("Total digit :"+counter);
		System.out.println("Sum of the digit is :"+sum);
		
	}

}
