package Basic_Programming;

public class Convertingdatatypes {
	
	public void stringtointeger()
	{
		String s="100";
		int i=Integer.parseInt(s);  //Integer is a wrapper classes
		System.out.println("String   Integer");
		System.out.println(s+100);
		System.out.println(i+100);
		
		float m=Float.parseFloat(s);//Float is a wrapper class
		System.out.println(s+100);
		System.out.println(m+100.23);
		
		int money=100;
		System.out.println(money+1);
		//convert String
		String bha=String.valueOf(money);
		System.out.println(bha+100);
		
		String name="bharani";
		char[] n=name.toCharArray();
		System.out.println(n);
		
		int t= 100; 
		//convert String
        String a=Integer.toString(t);
		System.out.println(a+"bh");

	}

	public static void main(String[] args) {
		Convertingdatatypes n1= new Convertingdatatypes();
		n1.stringtointeger();
	}

}
