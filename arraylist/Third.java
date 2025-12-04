package arraylist;
import java.util.ArrayList;

public class Third {
	public static void main(String [] args) {
	
		
		ArrayList<Integer>list =new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(30);
		
		System.out.println("Original list:"+list);
		ArrayList<Integer>list2 =new ArrayList<Integer>();
		
		for(int i=0; i<list.size();i++) {
			for(int j=i+1; j<list.size();j++) {
				if (list.get(i).equals(list.get(j))) {

                    if (!list2.contains(list.get(i))) {
                        list2.add(list.get(i));
                    }
				}
			}
		}
		
		System.out.println("Duplicates elements:"+list2);
	}
	}

