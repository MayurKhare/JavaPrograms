package thisKeyword;

public class Test 
{
	
	static int i;


	//below setvalue method will not be able to assign the value of i to the instance variable i, it will print 0, so to overcome this problem this keyword is used
	/*
	 * public void SetValue(int i) 
	 * { 
	 * 
	 * 	i=i;
	 * 
	 * }
	 */
	public void SetValue(int i) // here we can use this which can assign value to the instance variable
	{
		this.i=i;
		final int h;
		
	}
	
	public void show()
	
	{
		System.out.println(i);
	}
	
	static int j;
	
	byte k = 1;
	byte l = 2;
	
	byte c = (byte) (k+1);
	

	

}
