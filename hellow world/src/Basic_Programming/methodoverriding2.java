package Basic_Programming;

public class methodoverriding2 extends methodoverriding1
{
	public void bharanifamily()
	{
		System.out.println("MURUGESAN,THILAGAMANI,INDHUMATHI,BHARANIDHARAN, ARUNGOBINATH, HARITHRA");
	}

	public static void main(String[] args) {
		
		//methodoverriding1 fam= new methodoverriding1();
		methodoverriding2 f= new methodoverriding2();
		//fam.bharanifamily();
		f.bharanifamily();
	}

}
