package logical;

public class FindMaxArr {
	public static void main (String [] args) {
		
		int arr [] = { 10, 1 ,00,100,2000,30,11,4};
	
	int max = arr[0];
	int min = arr[0];
	
	for(int i=0; i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	for(int i =0; i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			
		}
	}
	System.out.println("Minimum Elements :"+min);
	System.out.println("Maximum Elements :"+max);
	}
}
