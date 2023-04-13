package Collection;



import java.util.HashSet;

public class HashCharcter {
	public static void main(String[] args) {
		
		HashSet<Character> set= new HashSet<Character>();
		// hashset call the add method 
		
		set.add('%');
		set.add('@');
		set.add('$');
		set.add('&');
		set.add('*');
		for(char s: set) {
			System.out.println(s);
		}
		HashSet hash = new HashSet();
		
		hash.add("RSK");
		hash.add('%');
		hash.add(12345);
		hash.add(null);
		//hash.add(12345);   //(not allow duplicate value or null value accept hashset)
		System.out.println(hash);
		for(Object f : hash) {
			System.out.println(f);
		}
				
	}

}
