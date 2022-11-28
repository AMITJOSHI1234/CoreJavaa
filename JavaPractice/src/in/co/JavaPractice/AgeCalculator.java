package in.co.JavaPractice;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class AgeCalculator {
public static void main(String[] args) throws ParseException {
	String date = "08/05/1990";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Calendar cal = Calendar.getInstance();
	cal.setTime(sdf.parse(date));
	
	Date curr = new Date();
	Calendar currTime = Calendar.getInstance();
	currTime.setTime(curr);
	
	int dob = cal.get(Calendar.YEAR);
	int curr1 = currTime.get(Calendar.YEAR);
	
	int age = curr1 - dob;
	
	System.out.println("Age of a person is:"+age);
}
}
