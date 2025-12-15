package treeset;
import java.util.TreeSet;

public class Four {

}
class Student {
	
	int rollnumber;
	String name;
	int marks;
	
	public Student(String name,int rollnumber,int marks) {
		this.name=name;
		this.marks=marks;
		this.rollnumber=rollnumber;
	}
	
	public String toString() {
		return this.name+this.marks+this.rollnumber;
	}
}
