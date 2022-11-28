package in.co.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
public class Comparision1 {
public static void main(String[] args) throws ParseException {
	String start = "10/10/15";
	String end = "12/2/12";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Date start1 = sdf.parse(start);
	Date end1 = sdf.parse(end);
	
//	Calendar cal = Calendar.getInstance();
//	cal.setTime(start1);
//	cal.setTime(end1);
//	
	if(start1.getTime() > end1.getTime()) {
		System.out.println("OK!!!");
	}else {
		System.out.println("error!!!");
	}
}
}
