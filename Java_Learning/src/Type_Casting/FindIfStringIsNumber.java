package Type_Casting;

public class FindIfStringIsNumber{
	
	public static void main (String[] args) 
	{
		String str = new String("123");
		int i = 123;
		
		FindIfStringIsNumber obj = new FindIfStringIsNumber();
		obj.test("2234");
		
	}
	
	public void test(String str1)
	{

		try
		{
			int i = Integer.parseInt(str1);
			System.out.println(true);
		}
		catch(Exception e)
		{
			
			System.out.println(false);
		}
	}
	
}