package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class RemoveEvenNum {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();

		Collections.addAll(a, 12,22,112,33,65,89,21,90,0,85,31);

		//LinkedList<Integer> b = new LinkedList<Integer>();

		 System.out.println("Given  List : "+a);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 != 0) {
				a.remove(i);
				//b.add(a.get(i));
				i--;
			}
		}
		
		
		System.out.println(a);
	}
}
