package Basic_Programming;

class Default_Constructor {
	
	Default_Constructor()
	{
	
	int id=100;
	String college ="NCT";
	String depart ="CSE";
	System.out.println(id);
	System.out.println(college);
	System.out.println(depart);
	
	}
	
	void display()
	{
		int id=101;
		String college ="NEC";
		String depart ="CSE";
	System.out.println(id);
	System.out.println(college);
	System.out.println(depart);
	
    }
		

	public static void main(String[] args) 
	{
		Default_Constructor cons=new Default_Constructor();
		//cons.display();
		Default_Constructor cons1=new Default_Constructor();
		Default_Constructor cons2=new Default_Constructor();
	


	}

}
