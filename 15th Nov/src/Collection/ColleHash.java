package Collection;

import java.util.HashMap;
import java.util.Map;

public class ColleHash {


public static void main(String[] args) { 
	
	//order of insertion Random
	HashMap<Integer,String> map= new HashMap();
	 map.put(12, "Automation");
	 map.put(13, "Manual");
	 map.put(14, "collection");
	 map.put(15, "SQL");
	 map.put(16, null);
	 map.put(19, null);           //(many null value are accept)
	 map.put(null, null);
	// map.put(null, "Kye");      //(only one accept dublicate key) 
	 
	 
	 //advanced for loop
	 for(Map.Entry<Integer, String> m : map.entrySet()) {
		 System.out.println("key="+m.getKey()+"value="+m.getValue());
	 }
	 System.out.println("************");
	 map.put(65, "XYZ");
	 
	 for(Map.Entry<Integer, String> m : map.entrySet()) {
		 System.out.println("key="+m.getKey()+"value="+m.getValue());
	 }
}
}
