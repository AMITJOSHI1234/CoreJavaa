package in.co.DateAndTime;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class DateComparision {
	public static void main(String[] args) throws ParseException {
		String dob = "08/05/96";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Calendar dob1 = Calendar.getInstance();
		dob1.setTime(sdf.parse(dob));
		
		Calendar today = Calendar.getInstance();
		int curMonth = today.get(Calendar.YEAR);
		int dobmonth = dob1.get(Calendar.YEAR);
		
		int age = curMonth - dobmonth;
		System.out.println("Your age is:"+age);
	}
}
