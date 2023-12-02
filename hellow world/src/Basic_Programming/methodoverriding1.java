package Basic_Programming;

public class methodoverriding1 extends methodoverloading {
	
	public void bharanifamily()
	{
		System.out.println("MURUGESAN,THILAGAMANI,INDHUMATHI,BHARANIDHARAN");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverriding1 vs=new methodoverriding1();
		vs.bharanifamily();
		methodoverloading me= new methodoverloading();
		me.bharanidharan("BHARANIDHARAN",104);
		
	}

}
