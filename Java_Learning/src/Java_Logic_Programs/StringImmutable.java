package Java_Logic_Programs;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s = "Mayur";
		String s1 = "Mayur";
		String s2 = new String("Mayur");
		
		System.out.println(s==s2);
		System.out.println(s==s1);
		System.out.println(s.equals(s2));
		//int i = 1;
		

	}

}
