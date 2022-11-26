package ThrowKeyword;

public class Test {

	public static void main(String[] args) 
	{
		
		int age = 17;
		
		if(age<18)
		{
			throw new SelfCreatedException("You are not eligible to vote, age is smaller then 18");
		}
		else
		{
			System.out.println("You can vote");
		}

	}

}
