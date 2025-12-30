package treemap;
import java.util.*;

public class Third {
	public static void main (String [] args) {
		
	
	Employee em = new Employee(101,"Omkar Kale",305010.001,"IT");
	Employee em2 = new Employee(102,"Nabheel Shekh",310010.0,"IT");
	Employee em3 = new Employee(103,"Vinod Pavan",205010.0,"Cyber Security");
	Employee em4 = new Employee(104,"Alok kunar",355010.0,"IT");
	Employee em5 = new Employee(105,"Vijay Tavari",308060.0,"VFX");
	Employee em6 = new Employee(106,"Bradman john",305000.0,"IT");
	Employee em8 = new Employee(107,"jooly axica",405010.0,"IT");
	Employee em9 = new Employee(108,"Leesa Samsang",205010.0,"IT");
	Employee em10 = new Employee(109,"harry joe",303010.0,"IT");
	Employee em11 = new Employee(1010,"prathmesh Patil",405010.0,"IT");
	Employee em7 = new Employee(1011,"Harbajan Singh",30550.0,"Ceyber Security");
	
	TreeMap<Employee, Integer> tm = new TreeMap<Employee,Integer>();
	tm.put(em,em.id);
	tm.put(em11, em11.id);
	tm.put(em10, em10.id);
	tm.put(em9, em9.id);
	tm.put(em8, em8.id);
	tm.put(em7, em7.id);
	tm.put(em6, em6.id);
	tm.put(em5, em5.id);
	tm.put(em4, em4.id);
	tm.put(em3, em3.id);
	tm.put(em2, em2.id);
	
	
	System.out.println(tm);
	
	int a = 1;
	for(Map.Entry<Employee, Integer> entry : tm.entrySet()) {
		
		System.out.println(a+". "+entry.getKey()+" : "+entry.getValue());
		a++;
	}
	
	}

}
class Employee implements Comparable <Employee>{
	int  id;
	String name;
	double salary;
	String department;
	
	public Employee(int id, String name,double salary,String department) {
		this.name= name;
		this.id=id;
		this.department=department;
		this.salary=salary;
		
	}
	public String toString() {
		return this.id+" "+this.department+" "+this.name+' '+this.salary;
	}
	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.id, o.id);
	}
	
	
	
}
