import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {
	
	public static void main(String[] args)
	{

	int[] arr = new int[]{1,2,3,4,0,6,7,8};
	
	int len = arr.length;
	
	int[] newarr = new int[len];
	
	int iCounter = 0;
	
	for(int i=0; i<len; i++)
	{
		
		if (arr[i]!=0)
		{
			newarr[iCounter] = arr[i];
			iCounter++;
			
		}
	}
	
	System.out.println(Arrays.toString(newarr));
	
	
	
	}
}
