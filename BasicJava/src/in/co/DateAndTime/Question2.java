package in.co.DateAndTime;
import java.util.Date;
import java.util.Calendar;
public class Question2 {
public static void main(String[] args) {
	Date d =new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	System.out.println("-------Maintenence days---------");
	for(int i=1;i<=12;i++) {
		 cal.add(Calendar.DATE, 30);
		 System.out.println(cal.getTime());
	}	
}
}
