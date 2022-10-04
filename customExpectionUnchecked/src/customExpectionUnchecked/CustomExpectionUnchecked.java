package customExpectionUnchecked;
public class CustomExceptionUnchecked extends RuntimeException {
	   public CustomExceptionUnchecked(String message) {
	      super(message);
	   }
	}

public class CustomExpectionUnchecked {
	static void valid (int a , int b ) throws CustomExceptionUnchecked{    
	       if(a==0 && b==0){  
	  
	        throw new CustomExceptionUnchecked("wrong input");    
	       }  
	       else {   
	        System.out.println("ok");   
	        }   
	     }    
	  
public static void main(String arg[]) {
	try {
        
        valid(10,0);
    }
    catch (ArithmeticException a) {
        System.out.println("You're multplying by zero!");
    }

}
}
