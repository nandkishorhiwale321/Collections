package treeset;
import java.util.TreeSet;

public class Four {
	public static void main (String [] args) {
		
		TreeSet <student> tree= new TreeSet<student>();
		
		student s = new student("Madhav",101,100);
		student s2 =new student ("gerish",102,90);
		
		tree.add(s);
		tree.add(s2);
		
		System.out.println(tree);
	}
}
class student implements Comparable <student>{
	
	int rollnumber;
	String name;
	int marks;
	
	public student(String name,int rollnumber,int marks) {
		this.name=name;
		this.marks=marks;
		this.rollnumber=rollnumber;
	}
	
	public String toString() {
		return this.name+" "+this.marks+" "+this.rollnumber;
	}

	

	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.marks,this.marks);
	}
}
