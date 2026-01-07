package api;

public class two {

	public static void main(String[] args) {
		
		tony <Integer, String> t=(t1, t2)-> {
			
			return "Lambada"+(t1+t2);
		};
		System.out.println(t.add(10, 30));
	}
}


interface tony <T,R> {
	
	R add(T t1, T t2);
}
