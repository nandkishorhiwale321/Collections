package iterator;

public class Third {
	public static void main (String [] args) {
		I_demo<Integer,String,Double>  iadd=(t1, r1, r2)->{
			return t1+r1+r2+"hello";
			};
			
		
	System.out.println(iadd.demo(100,10.00,10.00));

}
       
}

interface I_demo <T, A, R> {
	
	A demo(T t1, R r1, R r2);
}
