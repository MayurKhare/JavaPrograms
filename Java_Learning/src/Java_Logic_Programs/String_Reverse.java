package Java_Logic_Programs;

public class String_Reverse {

	public static void main(String[] args) {
		
		String var = "Mayur";
		int i = var.length();
		String var1 = "";
		char c;
		
		for (int j=0; j<i; j++)
		{	
			c = var.charAt(j);
			var1 = c+var1;	
		}
		
		System.out.println(var1);
	}

}
