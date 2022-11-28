package in.co.Encapusulation;

public class TestClass1 {
public static void main(String[] args) {
	Encapsulation1 en = new Encapsulation1();
	en.setfname("Raj");
	en.setlname("Dev");
	en.setid(3);
	
	String fname = en.getfname();
	System.out.println("Frist name:"+fname);
	
	String lname = en.getlname();
	System.out.println("Last name:"+lname);
	
	int id = en.getid();
			System.out.println("Id:"+id);
}
}
