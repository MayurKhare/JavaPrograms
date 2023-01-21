package ArrayList;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NavigableSet;

public class ProgramForArrayList {

	public static void main(String[] args) {

		// Arraylist
		ArrayList<String> arrr = new ArrayList<>();
		
		arrr.add("mayur");
		arrr.add("khare");
		arrr.add("maa");
		System.out.println(arrr.indexOf("mayur"));
		
		ListIterator<String> i = arrr.listIterator();
		
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		ArrayList<Integer> arr = new ArrayList<>();
		//ArrayList<int> arr1 = new ArrayList<>(); // this is not accepted, arrraylist dont accept primitve data type
		
		
		//Array
		Integer k[] = new Integer[4]; // but in array we can have both primitve as well as object type data(wrapper)
		int j[] = new int[4];// this is also accepted in array
		
		try
		{
		int c = 1/1;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*
		 * catch(ArithmeticException e) { e.printStackTrace(); }
		 */
		
		//FileInputStream fis = new FileInputStream("D:/test.txt");
		
		
		

	}

}
