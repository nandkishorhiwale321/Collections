package Set;
import java.util.HashSet;
import java.util.Objects;

public class Second {
	public static void main(String [] args) {
		
		HashSet<Object> set = new HashSet<>();
		
		set.add("nanda");
		set.add(10);
		set.add(null);
		set.add(null);
		set.add(10);
		
		Student s = new Student("Jonh",101,"12/06/2001","+A");
//		Student s2 = new Student("Jonh",101,"12/06/2001","+A");
		Student s3 = new Student("Jonny",101,"12/06/2001","+A");
		Student s2 = new Student("Jonh",101,"12/06/2001","+A");

		
		set.add(s);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
		
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s2));
	}

}
class Student {
	
	String name;
	int id;
	String DOB;
	String Grade;
	
	Student(String name,int id,String DOB, String Grade){
		this.DOB=DOB;
		this.Grade=Grade;
		this.name=name;
		this.id=id;
	}
	public String toString() {
		//System.out.println("inside the toString method");
		return name+","+id+","+DOB+","+Grade;
	}
	
	public int hashCode() {
		//System.out.println("inside the hashcode method");
		return Objects.hash(name, id, DOB, Grade);
	}
	
	public boolean equals(Object obj) {
	//	System.out.println("inside the equals method ");
		Student std = (Student)obj;
		return this.name.equals(std.name)&& this.DOB.equals(std.DOB)&&this.id==std.id&&this.Grade.equals(std.Grade);
	}
	
}
