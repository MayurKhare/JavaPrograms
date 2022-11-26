package OverridingAndOverLoadingConcept;

public class OverridingClass extends ParentClass{

	//creating overridden method
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Total is :" +c);
	}
}
