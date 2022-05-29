package Unit_3;

public class ExceptionHandlingInJava {

	public static void main(String[] args) {
		
		
		int b = 0;
		
		//sensitive code
		try {
			
		  int a = 100/b;
		  System.out.println(a);
		
		  System.out.println("OPERATION SUCCESSFUL. ");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
		   System.out.println(e.getMessage());	
		}
	}
   
}
