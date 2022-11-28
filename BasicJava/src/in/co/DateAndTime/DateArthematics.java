package in.co.DateAndTime;
import java.util.Date;
import java.util.Calendar;
public class DateArthematics {
public static void main(String[] args) {
	Date today =new Date();
	Calendar cal = Calendar.getInstance();
	  cal.setTime(today);
	  Date today1 = cal.getTime();
	  System.out.println(today1);
	  //Get year of the date
	  
	  int DayOfYear = cal.get(Calendar.DAY_OF_YEAR);
	  System.out.println(DayOfYear);
	  
	  //get yesterday date
	  
	  cal.add(Calendar.DATE, -1);
	  Date yesterday = cal.getTime();
	  System.out.println(yesterday);
	  
	  //get date after 30 days
	  
	  cal.add(Calendar.DATE, 30);
	  Date nextEvent = cal.getTime();
	  System.out.println(nextEvent);
	  
	  
	  
	
}
}
