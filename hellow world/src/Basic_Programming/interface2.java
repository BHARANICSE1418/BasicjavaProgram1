package Basic_Programming;

public  class interface2 implements interface1,interface1a
{	
	public void first() 
	{
	System.out.println("Indhumathi");	
	}
	public void second() 
	{
	    System.out.println("Bharanidharan");	
	}
	
	public void thired() 
	{
	System.out.println("Harithra");
	}
    public void four() 
    {
    System.out.println("none");
	}
    
    
	public static void main(String[] args) 
	{
		interface2 myPig = new interface2(); 
	    myPig.first();
	    myPig.second();
	    myPig.thired();
	    myPig.four();	
	    
	 }

}
