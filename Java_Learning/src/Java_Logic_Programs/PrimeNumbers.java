package Java_Logic_Programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers.findPrimeNumber(4);

	}
	
	public static void findPrimeNumber(int n)
	{
		 int i,m=0,flag=0;      
		  //it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	}

}
