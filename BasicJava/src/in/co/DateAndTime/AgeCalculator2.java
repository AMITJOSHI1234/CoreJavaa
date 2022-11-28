package in.co.DateAndTime;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class AgeCalculator2 {
	public static void main(String[] args) throws ParseException {
		String s1 = "22/05/87";
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(s1));
		
		Calendar cal1 = Calendar.getInstance();
		
		int dob = cal.get(Calendar.YEAR);
		int current = cal1.get(Calendar.YEAR);
		
		int age = current - dob;
		System.out.println("Age of employee is:"+age);
	}

}
