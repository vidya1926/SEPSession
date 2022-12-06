

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDate {

	public static void getCurrentDateAndTime() {
// Method 1		
		Date date = new Date();
	//	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Current Date :- "+dateFormat.format(date));
		
		System.out.println("******************");
// Method 2			
		DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Current Date & Time :- "+dateFormat2.format(cal.getTime()));
		
		System.out.println("******************");
	}
	
	
	public static String getCurentDateOnly() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		String format = formatter.format(cal.getTime());
		String[] split = format.split("/");
		String currentDay = split[0];
		System.out.println("Current Date :-" + currentDay);
		return currentDay;

	}
	public static String getMethod3() throws ParseException {
	String d1 = "22/07/1996";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date parse = sdf.parse(d1);
	System.out.println(parse);
	return d1;
	}
	
	public static void  addDate(int num) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
	
	//	System.err.println("Cal "+cal);
		cal.add(Calendar.DATE, num);
	//	Date time = cal.getTime();
	//  System.out.println(time);
		
		String format = sdf.format(cal.getTime());
		 
		format.replaceAll("\\W", "");
		System.out.println("Date :- "+format);
					
				//	return format;
					
	
	}
	
	public static void main(String[] args) throws ParseException {
	//	CurrentDate cd = new CurrentDate(); 
		getCurrentDateAndTime();
	    getCurentDateOnly();
		getMethod3();
		addDate(2);
	}

}
