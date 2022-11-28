package in.co.JavaPractice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateComparision {
public static void main(String[] args) throws ParseException {
	String d1 = "12/2/22";
	String d2 = "22/3/23";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Date date1 = sdf.parse(d1);
	Date date2 = sdf.parse(d2);
	
	if(date1.getTime()>date2.getTime()) {
		System.out.println("date1 is greter than date2");
	}else {
		System.out.println("Date2 is greter than date1");
	}
}
}
