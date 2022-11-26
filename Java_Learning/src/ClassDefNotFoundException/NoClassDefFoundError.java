package ClassDefNotFoundException;

public class NoClassDefFoundError {

	public static void main(String[] args) throws ClassNotFoundException {
		

			ClassForNoClassDefFoundError c = new ClassForNoClassDefFoundError();
			
			Object o = Class.forName("a").isInstance(c); //this will throw class not found exception
			
			
			
		
	}
	
	//now here as we are creating object of this class but the 'CLASSFILE' is not present of this class then  we will get "NoClassDefFound" error

}
