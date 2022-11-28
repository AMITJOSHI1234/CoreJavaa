package in.co.DateAndTime;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Calender1 {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	System.out.println(sdf.format(d));
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd,yyyy");
	String s1 = sdf1.format(d);
	System.out.println(s1);
	
	Date d1 = sdf.parse("13/11/22");
	System.out.println(d1);
}
}
