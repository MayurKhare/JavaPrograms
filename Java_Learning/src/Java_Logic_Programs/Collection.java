package Java_Logic_Programs;

import java.util.HashSet;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0, st=0,len=0,n;
		String S = "GEEKSFORGEEKS";
		n = S.length();
HashSet<Character> hs = new HashSet<Character>();
while(i<n)
{

	if(hs.contains(S.charAt(i)))
	{
	hs.clear();
	st =i;
	}

		hs.add(S.charAt(i));
		if((i-st +1) > len)
		{
			len = i -st +1;
		}
	
	i++;
}
	System.out.println(len);
	}

}
