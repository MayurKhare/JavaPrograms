package Java_Logic_Programs;

public class CharacterIsVowelOrConsonant {

	public static void main(String[] args) {

		
		CharacterIsVowelOrConsonant.CheckForVowelOrConsonant('e');

	}
	
	static void CheckForVowelOrConsonant(char a)
	{
		String str = "aeiouAEIOU";
		
		if (str.indexOf(a)!=-1)
		{	
			System.out.println("Character "+a+" is a vowel");
		}
		else
		{
			System.out.println("Character "+a+" is a consonant");
		}
	}

}
