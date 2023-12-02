package Basic_Programming;

public class print_address {
	
	public static void main(String args[])
	{

	int door_number=12;
	String village= "Veerappam palayam";
	String street="1st Street";
	String District="ERODE";
	String State ="TAMILNDU";
	
	System.out.println(door_number);
	System.out.println(village+" "+street+" "+District+" "+State);
	System.out.println(village.length()+" "+village.toUpperCase()+" "+village.toLowerCase());
	System.out.println(District.concat(" "+State));

	
	}

	
}