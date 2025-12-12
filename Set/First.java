package Set;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
public class First {
	public static void main(String [] args) {
		
	HashSet<Car> set = new HashSet<Car>();
		Car car = new Car("Thar", 101,1000000.32);
		Car car2 = new Car("Vagnar", 101,1000000.32);
	    Car car3 = new Car("Thar", 101,1000000.32);
		//System.out.println();
//		
//		set.add(22);
//		set.add(23);
//		set.add(65);
//		set.add(45);
//		set.add(22);
//		set.add(null);
//		set.add(null);
		
	    set.add(car3);
		set.add(car2);
		set.add(car);
		
		System.out.println(set);
		
	    System.out.println("hashcode of car :"+car.hashCode());
        System.out.println("hshcode of car2 :"+car2.hashCode());
        System.out.println("hashcode of car3 :"+car3.hashCode());
        
        
       System.out.println(car.equals(car3));
        
        
        
        System.out.println("size of the set is :"+set.size());
        
	}

}

class Car {
	//HashSet<Car> set = new HashSet<>();

	String name;
	int id;
	double price;
	
	public Car(String name, int id, double price) {
		this.name=name;
		this.id=id;
		this.price=price;
		
	}
	
	public String toString() {
		return name+" "+id+" "+price;
	}
	
	public int hashCode() {
		return Objects.hash(name, id, price);
	}
	public boolean equals(Object o)
	{
		Car c =(Car)o;

		return this.name.equals(c.name)&& this.id==c.id&&this.price==c.price;
					}
	
}
