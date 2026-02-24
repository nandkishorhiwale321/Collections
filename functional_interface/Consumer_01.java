package functional_interface;

import java.util.function.Consumer;

public class Consumer_01 {

	public static void main(String[] args) {
		
		
		Consumer <String> con = (i)->{
			
			System.out.println(i.length());
			
		};
		
		con.accept("nanda");

}
}