package Collections_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet<Character> t = new TreeSet<Character>();
		
		t.add('e');
		t.add('b');
		t.add('c');
		t.add('d');
		t.add('a');
		
		Iterator<Character> l = t.iterator();
		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}

	}

}
