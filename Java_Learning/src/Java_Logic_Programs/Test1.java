package Java_Logic_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
	
		for (int i=0; i<10; i++)
		{
			if(i==2)
			{
				System.out.println("Ending The Loop");
				continue;
			}
			
			System.out.println(i);
			
		}
	}
	
}
