package Collections_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		String str = "MayurKhare22222";
		 
		HashSet<Character> set = new HashSet<Character>();
		
		for (int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		Iterator<Character> it = set.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
