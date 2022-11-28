package in.co.DateAndTime;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateComparsion {
public static void main(String[] args) throws ParseException {
	String start = "10/05/14";
	String end = "15/05/15";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Calendar cal = Calendar.getInstance();
	Date start1 = sdf.parse(start);
	Date end1 = sdf.parse(end);
	
	cal.setTime(start1);
	cal.setTime(end1);
	
	if(start1.getTime() < end1.getTime()) {
		System.out.println("All OK!!!");
	}else {
		System.out.println("Error!!!");
	}
	
}
}
