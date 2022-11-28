package in.co.Interfaces;

public class Testmain1 {
public static void main(String[] args) {
	Bussinessman b = new Bussinessman();
	
	String s1 = b.donation();
	System.out.println(s1);
	String s2 = b.Party();
	System.out.println(s2);
	
	Student s = new Student();
	String s3 = s.donation();
	System.out.println(s3);
	
	String s4 = s.Party();
	System.out.println(s4);
}
}
