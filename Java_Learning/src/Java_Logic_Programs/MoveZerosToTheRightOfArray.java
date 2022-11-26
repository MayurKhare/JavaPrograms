package Java_Logic_Programs;

import java.util.Arrays;

public class MoveZerosToTheRightOfArray {

	public static void main(String[] args) 
	{

		Integer iArray[] = {1,2,3,0,3,5,9,10};
		
		
		
		int iNewArray[] = new int[iArray.length];
		
		int iCounter = 0;
		for (int i = 0; i<(iArray.length); i++)
		{
			if(iArray[i]!=0)
			{
				
				iNewArray[iCounter]=iArray[i];
				iCounter++;
			}
			
		}
		
		// first way of printing an array
		for (int i = 0; i<(iArray.length); i++)
		{
			
			System.out.println(iNewArray[i]);
			
			
		}
		
		// Second way of printing an array
		System.out.println(Arrays.toString(iNewArray));
		
		

	}

	

}
