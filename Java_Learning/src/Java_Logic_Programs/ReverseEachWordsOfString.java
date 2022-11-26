package Java_Logic_Programs;

public class ReverseEachWordsOfString {

	public static void main(String[] args) {
		
		String str = "Java Programming mayur khare";
		
		String[] strArray = str.split(" ");
		
		char c;
		String strNew = "";
		String strReverse = "";
		
		for (int i=0; i<strArray.length; i++ )
		{
			
			
			for (int j=0; j<strArray[i].length(); j++)
			{
				c = strArray[i].charAt(j);
				strNew = c+strNew;
						
			}
			
			
			strReverse = strReverse +strNew+" ";
			//strReverse.concat(strNew).concat(" ");
			//strNew.setLength(0);
			strNew = "";
			
			
		}
		
		System.out.println(strReverse);

	}

}
