package linkedlist;


public class Three {
	public static void main (String [] args) {
		
		/*
		 * Generic
		 */
		
		you <Integer , String> s =new you <Integer , String>();
		
		
		
		s.show(4, 5);
		s.fun("Nanda", "Kishor");

	
	
			
			
		}
		
	}

interface Ime <T ,V>{
	
	void show(T t1, T t2);
	void fun(V v1, V v2);  
}

class you <T ,V> implements Ime <T ,V> {
	
	public void show(T t1, T t2) {
		
		System.out.println(t1+" "+t2);
		
		
		
	}

	@Override
	public void fun(V v1, V v2) {
		 
		System.out.println(v1.toString()+v2);
	}
	
}
	


