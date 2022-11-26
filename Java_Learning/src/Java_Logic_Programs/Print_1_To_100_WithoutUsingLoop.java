package Java_Logic_Programs;

public class Print_1_To_100_WithoutUsingLoop {

	public static void main(String[] args) {
		
		printNum(1);
	}
	
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

}
