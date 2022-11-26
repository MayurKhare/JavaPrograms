package Java_Logic_Programs;

public class Print_HelloWorld_WithoutUsingSemiColon {
	
	static
	{
		System.out.println("Static Block");
		//Print_HelloWorld_WithoutUsingSemiColon.main(null);;
	}

	{
		System.out.println("Mayur");
	}
	public static void main(String[] args) {
		
		
		
		//1
		if(System.out.printf("Hello World"+"\n")==null)
		{
			// nothing
		}
		
		//2
		if(System.out.append("Hello World")==null)
		{
			// nothing
		}
		
		//3
		for(int i=0; i<1; System.out.println("Hello World"))
		{
			i++;
		}
		
		
		

	}
	
	

}
