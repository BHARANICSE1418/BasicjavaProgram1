package Basic_Programming;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Random;

public class Hellow_world extends Default_Constructor {
	
	Hellow_world()
	{
		System.out.println("MURUGESAN,THILAGAMANI,INDHUMATHI,BHARANIDHARAN");
	}
	
	public void randomnumber()
	{
		 Random t = new Random();
		 int randomnumber=t.nextInt(100);
		 float randomnumber1=t.nextFloat(100); 
		 System.out.println(randomnumber);
		 System.out.println(randomnumber1);
	}
	public void ipaddress() 
	{
		try {
			System.out.println("The IP Address of this system= "+InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void url()
	{
		URL url = null;
		try {
			url = new URL("http://www.google.com/homepage");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Host Name: "+url.getHost());
		System.out.println("Port Number: "+url.getPort());
		System.out.println("File Name: "+url.getFile());
        //System.out.println("Host Name: "+ip.getHostName());
        //System.out.println("IP Address: "+ip.getHostAddress());
	}
	
	public static void main(String args[])
	{
		Hellow_world ui=new Hellow_world();
		ui.randomnumber();
		ui.ipaddress();
		ui.url();
			
		
	}

}
