package in.co.OOPExcercise1;

public class Question3 {
public static void main(String[] args) {
	PersonQuestion3 p = new PersonQuestion3("amit", "joshi");
	
	String fname = p.getFname();
	System.out.println("First name:"+fname);
	
	String lname = p.getLname();
	System.out.println("Last name:"+lname);
	
	String fullname = p.toString();
	System.out.println("Full name is:"+fullname);
}
}
