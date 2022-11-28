package in.co.DateAndTime;
import java.util.Date;
import java.util.Calendar;
public class Calender2 {
public static void main(String[] args) {
	Date d = new Date();
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	
	//Set to current time
	cal.setTime(d);
	Date d1 = cal.getTime();
	System.out.println(d1);
	
	//Get year of the date
	int year = cal.get(Calendar.DAY_OF_YEAR);
	System.out.println(year);
	
	//Get Yesterday Date
	cal.add(Calendar.DATE, -1);
	Date yesterday = cal.getTime();
	System.out.println(yesterday);
	
	//Get Date after one month
	
	cal.add(Calendar.DATE, 30);
	Date month = cal.getTime();
	System.out.println(month);
	
	
}
}
