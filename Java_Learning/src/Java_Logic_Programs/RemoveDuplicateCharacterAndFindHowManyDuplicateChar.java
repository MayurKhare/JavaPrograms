package Java_Logic_Programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateCharacterAndFindHowManyDuplicateChar {

	public static void main(String[] args) {

		String str = "MMayurKhhaare";
		
		int i = str.length();
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for(int j=0; j<i; j++)
		{
			
			if(map.containsKey(str.charAt(j)))
			{
				
				map.put(str.charAt(j), map.get(str.charAt(j))+1);
			}
			else
			{
				map.put(str.charAt(j), 1);
			}
		}
		
		System.out.println(map);
		
		Iterator<Entry<Character,Integer>> l=map.entrySet().iterator();
		
		while(l.hasNext())
		{
			System.out.print(l.next().getKey());
		}

	}

}
