package in.co.DateAndTime;
import java.util.Date;
import java.util.Calendar;
public class Calender3 {
public static void main(String[] args) {
	Date d1 = new Date();
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	
	// set to current time
	cal.setTime(d1);
	System.out.println(cal.getTime());
	
	//Get year of the date
	int year = cal.get(Calendar.DAY_OF_YEAR);
	System.out.println(year);
	
	//Get Yesterday date
	cal.add(Calendar.DATE, -1);
	System.out.println(cal.getTime());
	
	//get date after one month
	cal.add(Calendar.DATE, 30);
	System.out.println(cal.getTime());
}
}
