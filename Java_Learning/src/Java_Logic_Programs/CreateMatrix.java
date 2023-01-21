package Java_Logic_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {
	
	// output 2 x 2 matrix = [1, 2]
	//						 [3, 4]				
	//						
	

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter the number of rows: and press Enter");
		int iRows = sc.nextInt();
		
		System.out.println("Please enter the number of columns: and press Enter");
		int iCols = sc.nextInt();
		
		//2d array
		int data[][] = new int[iRows][iCols];
		
		System.out.println("Now enter the data and press enter after each data");
		
		for (int i=0; i<iRows; i++)
		{
			for (int j=0; j<iCols; j++)
			{
				
				data[i][j] = sc.nextInt();
			}
				
		}
		
		// first way to print
		for (int i=0; i<iRows; i++)
		{
			for (int j=0; j<iCols; j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
				
		}
		
		// second way to print
		for(int[]r:data)
		{
			System.out.println(Arrays.toString(r));
		}
		
		

	}

}
