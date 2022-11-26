package Java_Logic_Programs;

public class Print_1_To_100_WithoutUsingNumbers {

	public static void main(String[] args) {


		int one = 'B'/'B'; // dividing asci value of B by its own ascii value, which will always be 1;
		String str = "ABCDEFGHIJ";
		
		for (int i = one; i<=str.length()*str.length(); i++)
		{
			System.out.println(i);
		}
		
		// Another way,'d' ascii value is 100;
		
		for (int i=one;i<='d';i++)
		{
			System.out.println(i);
		}

	}

}
