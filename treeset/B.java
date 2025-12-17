package treeset;
import java.util.TreeSet;

public class B {
	
	public static void main (String [] args) {
		/*
		 * print list of max to min salary.of 10 employee
		 * 
		 */
		
		TreeSet<Salary> set = new TreeSet<Salary>();
		
		Salary s = new Salary("Abhay Kumar",101,350000.0);
		Salary s2 = new Salary("Pritam kale",102,350000.01);
		Salary s3 = new Salary("Smith jolly",104,450000.0);
		Salary s4 = new Salary("Rakesh bardavaj",103,350100.0);
		Salary s5 = new Salary("Mushkan Khan",105,391000.0);
		Salary s6 = new Salary("Vinay Kumar",107,350000.0);
		Salary s7 = new Salary("Rajnandini Yadav",108,360000.0);
		Salary s8 = new Salary("Vinod Patil",106,360200.0);
		Salary s9 = new Salary("Leesa tay",109,340000.0);
		Salary s10 = new Salary("Raghav Rao",110,380000.0);
		
		
		
		set.add(s);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s6);
		set.add(s7);
		set.add(s8);
		set.add(s10);
		set.add(s9);
		
		int i = 1;
		
		System.out.println("*-*-*- Maximum to minimum salary-*-*-*\n");
		for(Salary sa :set) {
			
			System.out.println(i+" "+sa);
			
			i++;
		}
		
		i = 1;
		System.out.println("\n*-*-*-Minimum ti maximum salary-*-*-*\n");
		for(Salary  sa :set.descendingSet()) {
			
			System.out.println(i+" "+sa);
			
			i++;
			
	}

}
static class Salary implements Comparable <Salary>{
	
	String name;
	int id;
	double salary;
	
	public Salary(String name, int id, double salary) {
		this.name =name;
		this.id = id;
		this.salary = salary;
	}
	
	public String toString() {
		
		return this.name+"| ID:"+this.id+" | Salary:"+this.salary;
	}


	@Override
	public int compareTo(Salary o) {
		
		return Double.compare(o.salary, this.salary);
	}

}
}

