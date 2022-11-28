package in.co.DateAndTime;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Question1 {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Calendar dob = Calendar.getInstance();
	dob.setTime(sdf.parse("14/05/97"));
	
	Calendar today = Calendar.getInstance();
	int dob1 = dob.get(Calendar.YEAR);
	int today1 = today.get(Calendar.YEAR);
	
	int age = today1 - dob1;
	System.out.println(age);
	
}
}
