package treeset;
import java.util.*;

public class Tree {
	public static void main (String [] args) {
		
		TreeSet<Bank> set = new TreeSet<Bank>();
		Bank b1 = new Bank("Pratic ingale ",10203001,1000006.01);

		Bank b2 = new Bank("rahule Bodade",10203002,1000016.00);
		
		Bank b3 = new Bank ("yashraj Abbad",10203003,2311010.77);
		
		Bank b4 = new Bank("Rahul pimple ",10203004,190000.0);

		Bank b5 = new Bank("Nabeel Shekh",102030022,1100001.46);
		
		Bank b6 = new Bank ("Aarati Patel",10203009,2110010.23);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		set.add(b6);

//		System.out.println(set);
		
		int i= 1;
		for(Bank b : set) {
			System.out.println(i+"."+" "+b);
			i++;
		}
	}

}
class Bank implements Comparable <Bank> {
	
	String name;
	int AcNumber;
	double Balance;
	
	public Bank(String name, int AcNumber, double Balance) {
		this.name=name;
		this.AcNumber=AcNumber;
		this.Balance=Balance;
	}


public String toString() {
	return this.name+" "+this.AcNumber+" "+this.Balance;
}


@Override
public int compareTo(Bank o) {
	
	return Integer.compare(this.AcNumber, o.AcNumber);
}
}
