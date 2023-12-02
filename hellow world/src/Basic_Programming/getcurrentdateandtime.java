package Basic_Programming;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class getcurrentdateandtime {

	public static void main(String[] args) {
		
		GregorianCalendar dateandtime= new GregorianCalendar();
		 
		int day=dateandtime.get(Calendar.DAY_OF_MONTH);
		int month=dateandtime.get(Calendar.MONTH);
		int year=dateandtime.get(Calendar.YEAR);
		int weekday=dateandtime.get(Calendar.DAY_OF_WEEK);
		int hour=dateandtime.get(Calendar.HOUR);
		int minute=dateandtime.get(Calendar.MINUTE);
		int second=dateandtime.get(Calendar.SECOND);
		
		System.out.println("Today date and time is= "+day+"/"+
		month+"/"+year+"  "+weekday+"  "+hour+":"+minute+":"+second);

		


	}

}
