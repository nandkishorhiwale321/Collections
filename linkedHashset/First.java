package linkedHashset;
import java.util.LinkedHashSet;
public class First {
	public static void main (String [] args) {
		
		LinkedHashSet<Employee> lhs = new LinkedHashSet<Employee>();	
		/*
		 * linkedHashSet maintaine insertion order
		 * it is not allow duplicates value
		 */
		
		Employee e = new Employee("Manish Dey", 101);
		Employee e2 = new Employee("Karan Nathan",103);
		Employee e3 = new Employee("Karan Nathan",103);
		
		
		lhs.add(e2);
		lhs.add(e);
        lhs.add(e3);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		
	}

}
class Employee {
	
	
	String  name;
	int id;
	
	
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
		
		
	}
	
	public String toString() {
		return this.name+" "+this.id;
	}
	
}
