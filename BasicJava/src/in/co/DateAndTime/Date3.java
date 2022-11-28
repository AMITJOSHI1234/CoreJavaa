package in.co.DateAndTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date3 {
public static void main(String[] args) throws ParseException  {
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
	System.out.println(sdf.format(today));
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd,yyyy");
	System.out.println(sdf1.format(today));
	
	Date d1 = sdf.parse("13/11/22");
	System.out.println(d1);
}
}
