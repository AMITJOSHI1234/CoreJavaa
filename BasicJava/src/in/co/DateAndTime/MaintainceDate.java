package in.co.DateAndTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class MaintainceDate {
	public static void main(String[] args) {
		Date d = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Calendar today = Calendar.getInstance();
		today.setTime(d);
		
		for(int i=1;i<=12;i++) {
			today.add(Calendar.DATE, 30);
			Date month = today.getTime();
			System.out.println(month);
		}

	}
}
