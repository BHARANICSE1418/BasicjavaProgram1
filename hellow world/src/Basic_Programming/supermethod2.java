package Basic_Programming;

public class supermethod2 extends supermethod1 
{
	 

	 public void Bharanidharan()
	 {
		 int maths=10;
		 int com=20;
		 super.language();
		 
		 System.out.println("maths mark="+maths);
		 System.out.println("comp mark="+com);
		 System.out.println("-----------------");
		 super.language();
		 System.out.println("-----------------");
		 

		 
	 }
	 public void sridharan()
	 {   int tamil=44;
	     int english=55;
		 int science=77;
		 int social=66;
		 
		 
		 System.out.println("Tamil mark=   "+tamil);
		 System.out.println("english mark=  "+english);
		 super.language();  
		 System.out.println("science mark="+science);
		 System.out.println("social mark="+social);
		 
	 }
	 
	 public static void main(String args[])
			 {
		     supermethod2 n= new supermethod2();
		 
		         n.Bharanidharan();
		         n.sridharan();
		         
		 
			 }
}
