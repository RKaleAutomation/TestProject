package Collection;

import java.util.ArrayList;

public class AllCollection {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		 
		list.add(123);
		list.add("Automation");
		list.add(23.78f);
		list.add('@');
		
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*****************");
		list.remove(2);    //remove the no. of  index integer
		
		for(int i= 0;i<size; i++) {
			System.out.println(list.get(i));
		}
	}
}
