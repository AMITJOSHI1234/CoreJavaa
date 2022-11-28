package in.co.Inheritance;
import java.text.ParseException;
import java.util.Date;
public class Question1main {
public static void main(String[] args) throws ParseException {
	Question1Bussinessman b =new Question1Bussinessman("Amit", "USA","8/5/1997" );
	Question1Doctor d =new Question1Doctor("Amit", "USA","8/5/1997");
	Question1Student s =new Question1Student("Amit", "USA","8/5/1997");
	b.setIncome(2500000.23);
	
	double income = b.getIncome();
	System.out.println("Income of bussinessman:"+income);
	
   String name = b.getName();
   System.out.println("Name of person is:"+name);
   
   String address = b.getAddress();
   System.out.println("Address of person is:"+address);
   
   Date dob = b.getDob();
   System.out.println("Date of birth:"+dob);
   
   d.setRegis(10001);
   
   int registrationNo = d.getRegis();
   System.out.println("Registration no:"+registrationNo);
   
   s.setmarks(70);
   s.setroll("100CS100");
   
   int marks = s.getmarks();
   System.out.println("Marks of Student:"+marks);
   
   String roll = s.getroll();
   System.out.println("Roll number:"+roll);
}
}
