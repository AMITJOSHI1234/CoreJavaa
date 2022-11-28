package in.co.DateAndTime;
import java.time.LocalDate;
import java.time.Period;
public class AgeCalculator {
public static void main(String[] args) {
	String dob = "1997-05-08";
	LocalDate dob1 = LocalDate.parse(dob);
	
	LocalDate curryear = LocalDate.now();
	
	if((dob!=null) && (curryear!=null)) {
		System.out.println(Period.between(dob1,curryear).getYears());
	} else {
		System.out.println("Error!!!");
	}
}
}
