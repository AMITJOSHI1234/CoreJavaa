package in.co.Constructor1;

public class TestClass {
public static void main(String[] args) {
	Constructor1 c = new Constructor1("Vijay","chouhan",5);
	
	String fname = c.getfname();
	System.out.println("First name:"+fname);
	
	String lname = c.getlname();
	System.out.println("Last name:"+lname);
	
	int id = c.getid();
	System.out.println("Id:"+id);
}
}
