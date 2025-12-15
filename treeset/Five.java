package treeset;
import java.util.TreeSet;

public abstract class Five
{
	public static void main(String [] args)
	{
		TreeSet<Collage> set = new TreeSet<Collage>();
		
		Collage c = new Collage("Manish",101,99);
		Collage c1 = new Collage("Koshtubh",105,90);
		Collage c2 = new Collage("Karan",102,69);
		Collage c3 = new Collage("Minakshi",103,89);
		Collage c4 = new Collage("payal",104,90);
		
		set.add(c);
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		
		System.out.println(set);
		
		int i =1;
		
		for(Collage v : set) {
			System.out.println(i+" "+v);
			i++;
		}
		
	}

}
class Collage implements Comparable  <Collage> {
	
	String name;
	int roll;
	int marks;
	
	public Collage(String name, int roll, int marks) {
		this.name= name;
		this.marks= marks;
		this.roll=roll;
	}
	public String toString() {
		return this.name+" "+this.marks+" "+this.roll;
	}
	@Override
	public int compareTo(Collage o) {
		
		return Integer.compare(o.marks, this.marks);
				
		
		
		
	}
}
