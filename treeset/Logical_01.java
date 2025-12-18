package treeset;
import java.util.Comparator;
import java.util.TreeSet;

public class Logical_01 {
	
	public static void main(String [] args) {
		
		Amazon am =new Amazon("Noise Smart Watch",1200.0,4.9);
		Amazon am4 =new Amazon("HeadPhones",1700.0,4.8);
		Amazon am2 =new Amazon("Iphone 7 pro",650000.0,4.5);
		Amazon am3 =new Amazon("Laptop stand ",1000.0,3.9);
		
		
		
		
		TreeSet<Amazon> set = new TreeSet<Amazon>(new itemComparetor());	
		set.add(am3);
		set.add(am2);
		set.add(am4);
		set.add(am);
		
		
		System.out.println(set);
		
		int i =1;
		
		for(Amazon a :set) {
			
			System.out.println(i+" "+a);
			
			i++;
		}
	}

}
class Amazon implements Comparable <Amazon>{
	
	String item;
	double price;
	double reatings;
	
	public Amazon(String item, double price, double reatings) {
		this.item=item;
		this.price=price;
		this.reatings= reatings;
	}

	@Override
	public int compareTo(Amazon o) {
		return Double.compare(this.reatings, o.reatings);
	}
	
	public String toString() {
		return this.item+" "+this.price+" "+this.reatings;
	}
	
}
class itemComparetor implements  Comparator <Amazon>  {

	@Override
	public int compare(Amazon o1, Amazon o2) {
		
		return o1.item.compareTo(o2.item) ;
	}
	
}
class priceComparetor implements Comparator <Amazon> {

	@Override
	public int compare(Amazon o1, Amazon o2) {
		
		return Double.compare(o1.price, o2.price);
	}
	
}
class ReatingComparetor implements Comparator<Amazon> {

	@Override
	public int compare(Amazon o1, Amazon o2) {
		
		return Double.compare(o1.reatings, o2.reatings);
	}
}
