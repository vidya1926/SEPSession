

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckingDate {

	public   SimpleDateFormat sdf;
	public   Calendar cal;
	
		
	public static void  addDate(int num) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
	     //cal.add(Calendar.MONTH, num);
		cal.add(Calendar.DATE, num);

		String format = sdf.format(cal.getTime());
		String date = format.replaceAll("\\W", "");
		System.out.println("Date :- "+date );			
	}
	
	
		
		public static void main(String[] args) {	
		
			CheckingDate cd = new CheckingDate();
		    addDate(5);
		//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		//	String format = sdf.format();
		//	System.err.println("year in main"+format);
			
	/*		Date dt= new Date();
			int year = dt.getYear();
			int currentYear=1900+year;
			System.out.println("Currrent year"+ currentYear);
			String currentYearfromCal = Integer.toString(currentYear); 
	*/		
			
			
			
			
			
			

	}


}
