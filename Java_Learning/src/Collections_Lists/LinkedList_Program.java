package Collections_Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Program {

	public static void main(String[] args) {
		
		
		List <String> list = new LinkedList<String>();
		
		list.add("s");
		list.add("d");
		list.add("re");
		list.add("s");
		list.add(0, "dd"); //Inserts the specified element at the specified position in this list. 
							//Shifts the element currently at that position (if any)
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		if (list.contains("re")) // returns true if any element is present
		{
			System.out.println("yes");
		}
		
		
		System.out.println(list.size()); //gives the length of list
		
		System.out.println(list.get(0)); // gives the element on the basis of index
		
		list.clear();
		
		System.out.println(list.isEmpty()); // return true if list is empty
		

	}

}
