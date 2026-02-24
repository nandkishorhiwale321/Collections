package hasmap;
import java.util.HashMap;





public class Logical_01 {
	public static void main (String [] args) {
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "args");
		hm.put(2, null);
		hm.put(3, "Pride");
		hm.put(5, "Santhcouth");
		hm.put(4, "Legent");
		hm.put(0, "Mattu");
      System.out.println(hm.entrySet());
		
		System.out.println(hm);
		
		hm.replace(3, "Pride", "Sun_Pride");
		
		
		System.out.println(hm);
		
//		hm.clear();
//		
//		System.out.println(hm);
//		
		
		System.out.println(hm.containsKey(0));
		
		
		
		
		
		
		
		
		
	}

}
