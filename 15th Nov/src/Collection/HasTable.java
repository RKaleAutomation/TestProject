package Collection;

import java.util.Hashtable;
import java.util.Map;

public class HasTable {
	
	public static void main(String[] args) {
		
		 Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		 
		 table.put(34, "Mumbai");
		 table.put(24, "Pune");
		 table.put(36, "Delhi");
		 table.put(78, "Hydrabad");
		 table.put(23, "Noida");
		// table.put(null,"Abad");  //null key not accepted for key or both
	    //   table.put(34, null);    // null value not allow
		 for(Map.Entry<Integer, String>f: table.entrySet()) {
			 System.out.println("key"+f.getKey() + "value=" + f.getValue());
		 }
		 
	}
	

}
