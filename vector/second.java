package vector;
import java.util.Arrays;
import java.util.Vector;

public class second {
	public static void main (String []args) {
		/*
		 * vector are synchronized collection
		 * vector is legacy class
		 * vector is an a index base data structure
		 * Vector can store different data type
		 * Vector can store duplicates value
		 * Vector can store multiple Null values
		 * Vector follows the insertion order
		 * vector not follows the sorting order
		 * 
		 */
		
		Vector v = new Vector();
		v.add("nanda");
		v.add(1, 18);
		v.addElement('M');
		v.add("nanda");
		v.add(null);
		v.add(null);
		
		System.out.println(v.contains("n"));
		
		System.out.println(v);
		
		System.out.println(v.clone());
		
		Object [] arr = new Object[6];
		v.copyInto(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
