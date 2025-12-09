package arraylist;
import java.util.ArrayList;
public class MinElement {
	public static void main (String [] args) {
		
	
	
	ArrayList<Integer> a =new ArrayList<Integer>();
	a.add(3);
	a.add(6);
	a.add(8);
	a.add(3);
	a.add(9);
	a.add(62);
	a.add(1);
	a.add(69);
	a.add(86);
	a.add(-1);
	a.add(90);
	a.add(003);
	System.out.println("Given ArrayList :"+a);
	
	int min = a.get(0);
	for(int i=0; i<a.size(); i++) {
		if(min>a.get(i)) {
			min=a.get(i);
		}
	}
	System.out.println("Minimum element of an given arraylist :"+min);

}
}
