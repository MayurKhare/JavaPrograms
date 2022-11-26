package Java_Logic_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MayurKhare22222";
		 
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		Iterator<Character> it = set.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*
		 * for(Character c:set) { System.out.println(c); }
		 */
	}

}
