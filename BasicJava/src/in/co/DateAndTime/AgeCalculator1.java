package in.co.DateAndTime;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class AgeCalculator1 {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Calendar cal = Calendar.getInstance();
	cal.setTime(sdf.parse("22/02/57"));
	
	Calendar currTime = Calendar.getInstance();
	int dob = cal.get(Calendar.YEAR);
	int today = currTime.get(Calendar.YEAR);
	
	int age = today - dob;
	System.out.println("Your current age is:"+age);
}
}
