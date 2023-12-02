package Basic_Programming;

public class object_creation {
	
	int stu_id;
	String stu_name;
	String stu_depart;
	
	void details_display()
	{
		System.out.println(stu_id);
		System.out.println(stu_name);
		System.out.println(stu_depart);

	}
	
	void insertRecord(int a, String b, String c)
	{  
		stu_id=a;
		stu_name=b;
		stu_depart=c;
		System.out.println(stu_id+" "+stu_name+" "+stu_depart);

		
    }  
	public static void main(String[] args) 
	{
		
		object_creation obj = new object_creation();
		obj.stu_id=05;
		obj.stu_name="bharani";
		obj.stu_depart="NCT";
		obj.details_display();
		
		object_creation obj1 = new object_creation();
		object_creation obj2 = new object_creation();
        obj1.insertRecord(06,"deepan", "cse");
		obj2.insertRecord(11,"kannan","CSE");
		
		
	}

}
