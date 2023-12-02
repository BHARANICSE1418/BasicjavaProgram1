package Basic_Programming;

public class methodoverloading {
	
	String name;
	static int regno=165;
	public void bharanidharan()
	{
		System.out.println("Java is an Object Oriented Programming Languange");
	}
	public void bharanidharan(String name, int regno )
	{
		System.out.println("name "+name+" register "+regno+"");

		//System.out.println("Java is an Object Oriented Programming Languange");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading me= new methodoverloading();
		me.bharanidharan("BHARANIDHARAN",104);
		me.bharanidharan();
		me.bharanidharan();
		
	}

}
