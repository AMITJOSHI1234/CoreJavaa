package in.co.DateAndTime;
import java.text.ParseException;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;;
public class Date1 {
public static void main(String[] args) throws ParseException {
	Date d = new Date();
	System.out.println(d);
	
	//Date Formatting in our Format
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
	String str = sdf.format(d);
	System.out.println(str);
	
	//Parsing date into java format
	
	//String a = "12/11/22";
	//System.out.println(a);
	Date d1 = sdf.parse("12/11/22");
	System.out.println(d1);
}
}
