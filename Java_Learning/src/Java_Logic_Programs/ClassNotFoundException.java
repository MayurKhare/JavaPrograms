package Java_Logic_Programs;

public class ClassNotFoundException {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("Java_Logic_Programs.AbstractionClss"); //give a class name which is even not present
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//here it will throw thhe error "ClassNotFoundException
		

	}
//Java_Logic_Programs.Test1
}
