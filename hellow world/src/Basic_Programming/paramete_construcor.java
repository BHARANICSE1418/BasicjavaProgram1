 package Basic_Programming;

public class paramete_construcor
{

	int id;
	String college;
	String course;
	String dept;
	
	paramete_construcor(int id, String college, String course, String dept )
	{
	
		id=id;
		college=college;
		course=course;
    	dept = dept;
    	 System.out.println(id);
		 System.out.println(college);
		 System.out.println(course);
		 System.out.println(dept);
		 
	}
	
	
	public static void main(String[] args) 
	{
		
		paramete_construcor constr = new paramete_construcor(101,"NCT","CSE","Computer");
		Encapsulation encap1= new Encapsulation();
		encap1.setname("kamal");
		encap1.setAge(25);
		System.out.println("NAME="+encap1.getname()+"  "+"AGE=="+encap1.getAge());

		
		
	}

}
