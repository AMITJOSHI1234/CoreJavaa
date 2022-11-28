package in.co.DateAndTime;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Question3 {
public static void main(String[] args) throws ParseException {
	String start = "15/04/15";
	String end = "20/02/15";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Date start1 = sdf.parse(start);
	Date end1 = sdf.parse(end);
	
	Calendar cal = Calendar.getInstance();
	cal.setTime(start1);
	cal.setTime(end1);
	//Calendar cal = Calendar.getInstance();
	
	if(start1.getTime() > end1.getTime()) {
		System.out.println("Ok!!!");
	}else
		System.out.println("Error!!!");
	
}
}
