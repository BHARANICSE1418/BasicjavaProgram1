package Basic_Programming;

public class static_keyword {
	
	int stu_id;
	String stu_name;
	static String stu_depart= "CSE";
	
	void details_display()
	{
		
		System.out.println(stu_id);
		System.out.println(stu_name);
		System.out.println(stu_depart);

	}

	public static void main(String[] args) {
		static_keyword key= new static_keyword();
		key.stu_id=5;
		key.stu_name="bharani";
		//key.stu_depart= "IT";
		
		key.details_display();
		key.stu_id=6;
		key.stu_name="deepan";
		key.details_display();

	}

}
