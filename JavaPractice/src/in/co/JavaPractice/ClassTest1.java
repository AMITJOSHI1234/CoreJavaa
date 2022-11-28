package in.co.JavaPractice;

public class ClassTest1 {
public static void main(String[] args) {
	GetterSetter1 gs = new GetterSetter1();
	
	gs.setfname("Dev");
	gs.setlname("kapoor");
	gs.setaddress("22 Peterson street,England,UK");
	gs.setid(4);
	
	String fname = gs.getfname();
	System.out.println("First name:"+fname);
	
	String lname = gs.getlname();
	System.out.println("Last name:"+lname);
	
	String address = gs.getaddress();
	System.out.println("Address:"+address);
	
	int id = gs.getid();
	System.out.println("Id:"+id);
}
}
