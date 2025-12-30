package treemap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Two {
	public static void main (String [] args) {
		
		TreeMap<Integer,Student> tm = new TreeMap<Integer,Student>();
		
		Student s = new Student("Anuj Kumar",90,"Pass");
		Student s2 = new Student("Mahesh Patel",80,"Pass");
		Student s3= new Student("Rahul kale",96,"Pass");
		Student s4 = new Student("Nikita Tathe",94,"Pass");
		Student s5 = new Student("Vaishnavi Suhani",85,"Pass");
		Student s6 = new Student("Nanda  Patil",75,"Pass");
		
		
		
		tm.put(101,s);
		tm.put(103, s6);
		tm.put(102, s3);
		tm.put(106, s4);
		tm.put(105, s2);
		tm.put(104, s5);
		
		
  	//System.out.println(tm);
  		
  		for(Map.Entry<Integer, Student> en : tm.entrySet()) {
  			System.out.println(en.getKey()+" : "+en.getValue());
  			
  		}
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter Roll Number");
		int Roll = sc.nextInt();
		
		if(tm.containsKey(Roll)) {
			System.out.println(tm.get(Roll));
		}
		else
			System.out.println("Result not Found");
		
	}

}
class Student implements Comparable<Student> {
	
	String name;
	int marks;
	String result;
	
	Student(String name, int marks, String result){
		this.name=name;
		this.marks=marks;
		this.result=result;
		
	}
	public String toString() {
		return this.name+" "+this.marks+" "+
	this.result;
	}
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.marks, o.marks);
	}
	
}

	