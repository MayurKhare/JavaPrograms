package Collections_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapCode {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> li = new LinkedHashMap<String, Integer>();
		
		li.put("Khare", 1);
		li.put("Mayur", null);
		li.put("Mayank", null);
		li.put(null, 5);
		li.put(null, 6);
		
		System.out.println(li);

	}

}
