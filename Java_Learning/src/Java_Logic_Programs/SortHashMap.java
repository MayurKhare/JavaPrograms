package Java_Logic_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {


		Map<String, Integer> capitalmapUnsorted = new HashMap<String, Integer>();
		capitalmapUnsorted.put("India",100);
		capitalmapUnsorted.put("USA",100);
		capitalmapUnsorted.put("UK",100);
		capitalmapUnsorted.put("Spain",100);
		
		Iterator<Entry<String, Integer>> it = capitalmapUnsorted.entrySet().iterator();
		
		
		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		System.out.println("----------");
		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>(capitalmapUnsorted);
		
		
		
		Iterator<String> it1 = treemap.keySet().iterator();
		
		while(it1.hasNext())
		{
			String key = it1.next();
			Integer value = treemap.get(key);
			System.out.println(key+" "+ value);
		}
		
	}

}
