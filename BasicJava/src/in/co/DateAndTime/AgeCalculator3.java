package in.co.DateAndTime;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class AgeCalculator3 {
  public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yy");
	Calendar dob = Calendar.getInstance();
	dob.setTime(sdf.parse("22/02/1957"));
	
	Calendar today1 = Calendar.getInstance();
	
	int dob1 = dob.get(Calendar.YEAR);
	int today = today1.get(Calendar.YEAR);
	
	int age = today - dob1;
	System.out.println("Your age is:"+age);
	}
}
