package hasmap;
import java.util.HashMap;

public class First {
	public static void main(String [] args) {
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("Mumbai", 1000000);
		map.put("Pune", 5000000);
		map.put("Nagpur", 600000);
		map.put("Delhi", 1000000);
		
		System.out.println(map);
	}

}
