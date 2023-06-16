package clm;

public class TryCatchDemo {

	public static void main(String[] args) {
	    try  
        {  
        int data=50/0; //may throw exception   
        }  
            // handling the exception by using Exception class      
        catch(Exception e)  
        {  
            System.out.println("Cant divide by Zero");  
        }  
     //   System.out.println("rest of the code");  
    }  

	}


