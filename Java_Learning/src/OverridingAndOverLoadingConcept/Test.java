package OverridingAndOverLoadingConcept;

public class Test {

	public static void main(String[] args) {


		ParentClass pc = new OverridingClass(); //this is overriding or run time polymorphism where on 
												//runtime it is decided whether we have to call parentclass method or childclass method
		pc.add(2, 3);
		
		
		OverLoadingClass oc = new OverLoadingClass();
		
		oc.add(3, 4, 5); // this is called overloading
		
		oc.add(3, 4, 5,6); // this is called overloading, where on the size of parameter it is decided which add method needs to be called

	}

}
