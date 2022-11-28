package in.co.JavaPractice;
import java.util.Date;
import java.util.Calendar;
public class MaintanceDate {
public static void main(String[] args) {
	Date d = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	System.out.println("   Maintaince Date    ");
	
	for(int i=1;i<=12;i++) {
		cal.add(Calendar.DAY_OF_WEEK, 30);
		System.out.println(cal.getTime());
	}
}
}
