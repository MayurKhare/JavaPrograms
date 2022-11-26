package Java_Logic_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IteratorInHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalmap = new HashMap<String, String>();
		capitalmap.put("India","Delhi");
		capitalmap.put("USA","Washington");
		capitalmap.put("UK","London");
		capitalmap.put("Spain","Madrid");
	
		System.out.println("********************Iterator1*************************");
		//iterator - 1 : over the keys: by using keySet()
		Iterator<String> it = capitalmap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();// to get the key
			String value = capitalmap.get(key);  //to get the value
			System.out.println(key+" "+value);
			
		}
		
		System.out.println("");
		System.out.println("********************Iterator2*************************");
		
		//iterator - 2 : over the set (pair): by using entrySet
		Iterator<Entry<String, String>> it1 = capitalmap.entrySet().iterator();
		
		while(it1.hasNext())
		{
			Entry<String, String> keyValue = it1.next();// to get the keyvalue pair
			System.out.println(keyValue.getKey()+ " "+keyValue.getValue());
			
			
		}
		
		System.out.println("");
		System.out.println("********************Iterator3*************************");
		//iterator - 3 : using java 8 for each and lambda
		capitalmap.forEach((k,v)->System.out.println(k+" "+v));

	}

}
