package Collections_Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {

	public static void main(String[] args) {
		
		HashMap<String, Integer> li = new HashMap<String, Integer>();
		
		li.put("Khare", 1);
		li.put("Mayur", null);
		li.put("Mayank", null);
		li.put(null, 5);
		li.put(null, 6);
		
		System.out.println(li);

	}

}
