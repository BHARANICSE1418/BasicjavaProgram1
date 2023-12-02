package Basic_Programming;

import java.util.Scanner;

public class exceptionhandling {
	
   public void exception(int num1, int num2)
	 {
		
	   
		try {
			
			int result=num1/num2;
			System.out.println("The Division values is ="+result);

		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception");
		}
		finally
		{
			System.out.println("Finally block always Executed");
		}

	 }
   
   public void throwandthrows()
   {
	   int age=2;
	   if(age<18)
	   {
		   throw new ArithmeticException("You are not eligible for voting in india"); 
	   }
	   else
	   {
		   System.out.println("Welcome to the voter of india"); 

	   }
   }
	 
	 public static void main(String[] args)
	 {
	 
	 exceptionhandling ex= new exceptionhandling();
	 ex.exception(0,10);
	 ex.throwandthrows();
	 }

}
