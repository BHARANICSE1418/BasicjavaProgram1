package Basic_Programming;

public class this_keyword 
{

	int id;
	String college;
	//The this keyword refers to the current object in a method or constructor. 
	//this keyword is to eliminate the confusion between class attributes and parameters with the same name 
	//(because a class attribute is shadowed by a method or constructor parameter).
	
	this_keyword(int id, String college)
	{
	 
		 this.id=id;
	     college=college;		 
		 
	}
	void display()
	{
	 System.out.println(id);
	 System.out.println(college);
	

	}
   public static void main(String[] args) {
		
		this_keyword thiskey= new this_keyword(65,"NCT");
		thiskey.display();
		
	}

}
