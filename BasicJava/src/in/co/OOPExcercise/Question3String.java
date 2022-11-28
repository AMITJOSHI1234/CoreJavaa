package in.co.OOPExcercise;

public class Question3String {
public static void main(String[] args) {
	Question3Constructor q = new Question3Constructor("Jay", "Shah");
	
	String fname = q.getfname();
	System.out.println("First name of persion is:"+fname);
	
	String lname = q.getlname();
	System.out.println("Last name of persion is:"+lname);
	
	String fullname = q.toString();
	System.out.println("Full name of persion is:"+fullname);
}
}
