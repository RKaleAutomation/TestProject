package Collection;

import java.util.ArrayList;

public class Collection2 {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> list = new ArrayList();
	
	list.add(123);
	list.add(456);
	list.add(23798);
	list.add(74327);
	
	int size = list.size();
	System.out.println(size);
	
	for(int i=0;i<list.size(); i++) {
		System.out.println(list.get(i));
	}
	System.out.println("******************");
	list.remove(2);
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}

}
}
	