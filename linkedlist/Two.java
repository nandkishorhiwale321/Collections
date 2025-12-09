package linkedlist;
import java.util.LinkedList;

public class Two {
	public static void main (String [] args) {
		
		LinkedList<Student> s = new LinkedList<Student>();
		/*
		 * Perform remove operation on Linked List and calculate how many time taken on it
		 */
		
		
		for(int i =0 ;i <1000000; i++) {
			s.add(new Student(1,22,"abc"));
	}
		long start_Time=System.nanoTime();
		System.out.println(s.remove(99));	
		long end_Time=System.nanoTime();
		System.out.println("Time taken for linkedlist is  :"+(end_Time-start_Time)/1000);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
	}
}
class Student {
	
	int id;
	int age;
	String name;
	
	Student(int id, int age, String name ){
		this.age=age;
		this.id=id;
		this.name=name;
		
		
	}
	
	
	
		
}

