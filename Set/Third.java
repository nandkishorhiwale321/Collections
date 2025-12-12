package Set;
import java.util.HashSet;
import java.util.Objects;
import java.time.LocalDateTime;

public class Third {
	public static void main (String [] args) {
		
		
		LocalDateTime  ltm =LocalDateTime.of(2002, 11, 29, 13, 7);
	
		Mobile m = new Mobile("Jonh Obroy",399.10, new LocalDateTime[] { ltm });
		
		
		HashSet<Mobile> set =new HashSet<Mobile>();
		
		set.add(m);
		System.out.println(set);
		
		
		for(Mobile mobile:set)
		{
			 System.out.println(mobile);
		}
		
		
	}

}
class Mobile {
	
	String Customer;
	double price;
	LocalDateTime [] Recharge;
	public Mobile(String Customer, double price,LocalDateTime [] Racharge) {
		this.Customer = Customer;
		this.price = price;
		this.Recharge = Recharge;
	}
	
	public int hashCode() {
		return (int)this.price+this.Customer.length();
	}
	
	public boolean equals(Object obj) {
		
		Mobile mm =(Mobile)obj;
		return this.Customer.equals(mm.Customer)&&this.price==mm.price;
		
	}
	
	public String toString()
	{
		
		StringBuffer s=new StringBuffer();
		for(LocalDateTime local:Recharge)
		
		{
			s.append(local.toString()+" :");
		}
					
		
		return this.Customer+" "+this.price+" "+s;
	
	}
}
