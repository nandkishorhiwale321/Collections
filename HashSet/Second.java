package HashSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Second {
	
	public static void main (String [] args) {
		
		HashSet <Company> set = new HashSet <Company>();
		

		Company c = new Company("Raj Tripathi",101,"Development");
		Company c2 = new Company("Mahan Patel",103,"Development");
		Company c3 = new Company("Raj Tripathi",101,"Development");
		Company c4 = new Company("Sidarth Kulkarni",102,"Development");
		Company c5= new Company("Leesa Helly",105,"Development");
		Company c6 = new Company("Arena Mrssi",104,"Development");
		
		set.add(c);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);
		set.add(c6);
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());	
		System.out.println(c4.hashCode());	
		System.out.println(c5.hashCode());
		System.out.println(c6.hashCode());	
		
		System.out.println(set);

		
		System.out.println(c.equals(c3));


		
		int i =1;
	
	for(Company company :set) {
		System.out.println(i+". "+company);
		i++;
	}
		
		
		
//		int i =0;
//		 for(Company v: set) {
//			 System.out.println(set.hashCode());
//			 i++;
//		 }
//		
		
//		System.out.println(set);
		
//		Iterator<Company> it =set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			
////			int i =1;
//		}
//		for(Company company :set) {
//			System.out.println(i+" "+company);
//			i++;
//		}
		
		
		
	}

}
class Company
{
	String name;
	int id;
	String deparment;
	
	public Company(String name, int id, String deparment) {
        if (id <= 0) throw new IllegalArgumentException("Invalid ID");

		this.name=name;
		this.deparment=deparment;
		this.id=id;
	}
	  public String toString () {
		  return this.name+" | "+this.deparment+" | "+this.id+" |";
	  }

	 public int hashCode () {
		 return Objects.hash(name,id,deparment);
	 }
	 
	 public boolean equals(Object obj) {
		 
		 Company cm =(Company)obj;
		 return this.name.equals(cm.name) && this.id==cm.id && this.deparment.equals(cm.deparment);	 }
}
