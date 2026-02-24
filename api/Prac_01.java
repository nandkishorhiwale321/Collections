package api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac_01 {

	public static void main(String[] args) {
		
		List list =List.of("Oma");
		
		List<String> list1 = List.of("nanda ","venkya");
		
		List<String> combine= (List<String>) Stream.concat(list.stream(),list1.stream()).collect(Collectors.toList());
	//	List list =List.of("nanda","vencky").stream().map((i)->{return i;})
		//.forEach((i)->{System.out.println(i);});;
       System.out.println(combine);
	}

}
