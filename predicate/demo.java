package predicate;

import java.util.function.Consumer;

public class demo {

	public static void main(String[] args) {
		
		Consumer<Integer> con=(i)->{
			System.out.println(i*2);
		};
		con.accept(2);
	}

}
