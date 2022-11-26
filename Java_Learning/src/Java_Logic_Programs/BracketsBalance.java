package Java_Logic_Programs;

import java.util.HashMap;
import java.util.Stack;

public class BracketsBalance {

	public static void main(String[] args) {
		
		boolean iFlag;
		 
		iFlag=funcBracketBalanced("{}");
		System.out.println(iFlag);
  }
	
	public static boolean funcBracketBalanced(String str)
	{
		if (null == str || ((str.length() % 2) != 0)) {
		    return false;
		} else {
		    char[] ch = str.toCharArray();
		    for (char c : ch) {
		        if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
		            return false;
		        }
		    }
		}
		return false;
	}
}
