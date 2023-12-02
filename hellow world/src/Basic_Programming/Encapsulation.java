package Basic_Programming;

public class Encapsulation {
	
	private String name;
	private int Age;
	
	
	public String getname()
	{
		return name;
	}
	public int getAge() 
	{
		return Age;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Encapsulation encap= new Encapsulation();
		encap.setname("bharani");
		System.out.println("NAME="+encap.getname());
				

	}

	

	

}
