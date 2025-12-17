package treeset;
import java.util.TreeSet;
import java.lang.*;

public class A {
	public static void main (String [] args) {
		
		TreeSet<Student> set = new TreeSet<Student>();
		TreeSet<EmployeeAttendence> set2 = new TreeSet<EmployeeAttendence>();
		
		
		Student s = new Student("abc",82);
		Student s2 = new Student("def",90);
		Student s3 = new Student("hgf",96);
		Student s4 = new Student("dmmf",90);
		
		EmployeeAttendence e = new EmployeeAttendence("Mandar",1010101,10.0);
		EmployeeAttendence e2 = new EmployeeAttendence("Vinod",1010102,12.00);
		EmployeeAttendence e3= new EmployeeAttendence("Mandar",1010101,33.03);
		EmployeeAttendence e4 = new EmployeeAttendence("Kavya",1010104,50.00);
		EmployeeAttendence e5 = new EmployeeAttendence("Rahul",1010103,10.33);
		
		
		
		set.add(s2);
		set.add(s);
		set.add(s4);
		set.add(s3);
		
		int i =1;
		for(Student v : set) {
			System.out.println(i+". "+v);
			i++;
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		
//      	System.out.println(set);
      	
      	set2.add(e);
      	set2.add(e2);
      	set2.add(e3);
      	set2.add(e4);
      	set2.add(e5);
      	
//      	System.out.println(set2);
      	
      	int ii =1;
      	
      	for(EmployeeAttendence em : set2) {
      		
      		System.out.println(ii+". "+em);
      		ii++;
      	}
		
		
	}

}
class Student implements Comparable <Student>{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	
		
	public String toString() {
		return this.name+" "+this.marks;
	}


	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(o.marks, this.marks);
	}

	
}
class EmployeeAttendence implements Comparable<EmployeeAttendence> {
	
	String name;
	int id;
	double salary;
	
	public EmployeeAttendence(String name, int id,double salary) {
		
		this.name=name;
		this.id=id;
		this.salary=salary;
	} 
	public String toString() {
		return this.name+" "+this.id+" "+this.salary;
	}
	public int compareTo(EmployeeAttendence o) {
		
		return Integer.compare(this.id, o.id);
	}
}