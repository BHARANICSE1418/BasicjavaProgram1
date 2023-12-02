package Basic_Programming;

public class Static {
	
	//static method allowed only static method
	//non Static method allowed non static and static method 
	//No, we cannot override static methods
   //Can we overload static methods? The answer is 'Yes'. We can have two or more static methods with the same name,
   // but differences in input parameters.
	 static int bha=10;
	public static void happy1()
	{
		System.out.println("Static mathod");
		System.out.println("The staticvaraible "+bha);
	}
	
	public static void happy2()// static
	{
	    happy1();// static
		System.out.println("static method");
		
	}
	public void happy3()// non-static
	{
		System.out.println("The staticvaraible "+bha);
		System.out.println("No static method");	
		happy1(); // static
		
	}
	public void happy4()// non-static
	{
		System.out.println("No static method");
		happy1(); //static
	    happy3(); // non-static
	}
	public static void happy5()
	{
	      happy1(); //static
	   // happy3(); non static
	   // happy4(); non static
		  System.out.println("static method");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static h= new Static();
		h.happy2();
		h.happy3();
		h.happy4();
		h.happy5();
		
		
	}

}
