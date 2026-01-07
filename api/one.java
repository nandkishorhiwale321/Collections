package api;

public class one {

	public static void main(String[] args) {
		I_one<Integer> i =(t1, t2)->{
			System.out.println(t1+t2);
		};
		
		i.demo(10, 10);
	}}

interface I_one <T>{
	
	void demo(T t1, T t2);
}