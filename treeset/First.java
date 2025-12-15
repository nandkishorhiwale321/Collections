package treeset;

import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;

public class First {
	public static void main(String[] args) {

		TreeSet<Employee> set = new TreeSet<Employee>();

		Employee e = new Employee("Nandkishor Hiwale", 12123030, 42000.12);
		Employee e2 = new Employee("Omkar kale", 12123031, 35000.00);
		Employee e3 = new Employee("Azim Tamboli", 12123032, 37000.12);
		Employee e4 = new Employee("Priya Sharma", 12123033, 35000.00);
		Employee e5 = new Employee("Bunny Sharma", 1212304, 35000.00);

		set.add(e);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);

		System.out.println(set);

		int i = 1;
		for (Employee m : set) {
			
		
				System.out.println(i+" "+m);
				i++;
			}
			//System.out.println(i +" "+ m);

		}
	}



class Employee implements Comparable<Employee> {
	String name;
	int id;
	double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String toString() {
		return this.name + ", " + this.id + ", " + this.salary;

	}

	@Override
	public int compareTo(Employee o) {

		return Integer.compare(this.id, o.id);
	}
}
