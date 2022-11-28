package in.co.DateAndTime;
import java.util.Date;
import java.util.Calendar;
public class Maintanance1 {
public static void main(String[] args) {
	Date d = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	
	for(int i=1;i<=12;i++) {
		cal.add(Calendar.DATE, 30);
		Date month = cal.getTime();
		System.out.println(month);
	}
}
}
