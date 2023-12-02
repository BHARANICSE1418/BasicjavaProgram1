package Basic_Programming;

import java.util.Scanner;

public class scanner_class 
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 1st:");
	int first = sc.nextInt();
	System.out.println("Enter 2nd:");
	int second = sc.nextInt();
	int c= first+second;
	System.out.println(c);
	sc.close();
     }
	
	
}
