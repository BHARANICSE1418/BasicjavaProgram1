package Basic_Programming;

import java.util.Scanner;

public class for_loop1 
{
	
	public static void main(String args[])
	    {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your value:");
		int n = sc.nextInt();
	        for(int i=0; i<n; i++)
	        {  
	         for(int j=0; j<=i; j++)
	            {
	                System.out.print(" 1 ");
	            }
	            System.out.println();
	            
	        }
	   }
	 
	   
	   
}
