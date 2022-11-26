package ThrowKeyword;

public class SelfCreatedException extends RuntimeException {
	
	public SelfCreatedException(String msg) {
		
		super(msg); 
	}
	
	public SelfCreatedException() {
		
		super(); 
	}


}
