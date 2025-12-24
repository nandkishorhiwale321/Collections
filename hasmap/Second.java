package hasmap;
import java.util.HashMap;
import java.util.Map;

public class Second {
	public static void main(String [] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("State Bank of india", "61077.0 Cr");
		map.put("HDFC Bank", "60811.0 Cr");
		map.put("ICICI Bank","40888.0 cr");
		map.put("Axius Bank", "24861.0 Cr");
		map.put("Kotak Mahindra Bank", "13521.0 Cr");
		
		
		System.out.println(map+"\n");
		
		System.out.println("Top 5 banks in india(Net profits in Cr):");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println("\nSize :"+map.size());
		
		if(map.containsKey("HDFC Bank")) {
			
			System.out.println("true");
		}
		else
			System.out.println(map.put("HDFC", null));
	}
	

}
