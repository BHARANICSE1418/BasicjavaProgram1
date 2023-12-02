package Basic_Programming;

public class Stringbuffer {

	
	/* StringBuffer is synchronized and thread safe
	 * StringBulider is not synchronized and not thread safe
	 * StringBuffer is less Efficient than stingBuilder
	 * StringBuilder is more Efficient than StringBuffer
	 * */
	
	public void stringbuffer()
	{
		
		StringBuffer buf = new StringBuffer("bharanidharan ");
		buf.append(" Murugesan");
		System.out.println(buf);
		
		StringBuffer buf1 = new StringBuffer("bharani");
		buf1.insert(7, "dharan");
		System.out.println(buf1);
		
		StringBuffer buf2 = new StringBuffer("bharani");
		buf2.replace(1,7,"dharan");
		System.out.println(buf2);

		StringBuffer buf4= new StringBuffer("bharani");
		buf4.delete(3,6);
		System.out.println(buf4);
		
		StringBuffer buf5 = new StringBuffer("bharanidharan");
		buf5.reverse();
		System.out.println(buf5);
		StringBuilder buf6 = new StringBuilder("bharanidharan");
		buf6.reverse();
		System.out.println(buf6);
		
	}
	public static void main(String[] args) {
		
		Stringbuffer buf123 = new Stringbuffer();
		buf123.stringbuffer();
		

	}

}
