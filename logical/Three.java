package logical;
import java.util.Scanner;

public class Three {
	
	public static void main (String [] args) {
		
		int fact =1;
		System.out.println("Enter number");
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		
		
		System.out.println("Input is : "+x);
		
		if(x<10) {
			
			System.out.println("Enter volid input :");
			
			
		}
		else {
			
		
		for(int i=1; i<=x; i++) {
			fact=fact*i;
	
		}	
		System.out.println("Fatorial of is : "+fact);
		}
				
	//	System.out.println("Fatorial of is : "+fact);
		
	}

}
