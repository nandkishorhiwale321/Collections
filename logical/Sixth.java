package logical;
import java.util.Scanner;


public class Sixth {
	public static void main (String [] args ) {
		
		Scanner sc =new Scanner (System.in);
		
		
		
		System.out.println("Enter Cost price");
		double CP =sc.nextDouble();
		
		System.out.println("Enter selling price");
		double SP = sc.nextDouble();
		
		
		if(SP>CP) {
			
			double Profit =SP-CP;
			System.out.println("Total profit :"+Profit);
			System.out.println("Total Profit % :"+(Profit/CP)*100);
		}
		else if(CP>SP) {
			
			double loss = CP-SP;
			System.out.println("Total loss :"+loss);
			System.out.println("Total loss % :"+(loss/CP)*100);
		}
	
		
		
	}
	}
		