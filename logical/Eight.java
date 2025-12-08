package logical;
import java.util.Scanner;

public class Eight {
	public static void main (String [] args) {
		
		/*
		 * check numbers prime or not.
		 */
	       
		Scanner sc = new Scanner(System.in);
	 
		System.out.println("Enter number  :");
		int num =sc.nextInt();
		
		
		if(num<=1) {
			System.out.println("not prime");
			return;
		}
		
		boolean isPrime = true;
		
		for(int i =2; i < num; i++) {
			
			if(num%i==0) {
				isPrime =false;
				
				break;
			}
			
		}
		if(isPrime) {
			
			System.out.println("prime number");
		
		}
		else {
			System.out.println("not prime");
		}
		

	}

}
