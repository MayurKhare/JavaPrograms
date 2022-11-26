package superKeyword;

public class SubClass extends SuperClass{
	
	
	int a = 10;
	
	SubClass()
	{
		System.out.println("constructor of subclass");
	}
	
	void testmethod()
	{
		super.testmethod();
		System.out.println("subclass_testmethod "+a);
		System.out.println("superclass_testmethod "+super.a); // if you want to refer a super class variable from the base class then we can use super
	}

}
