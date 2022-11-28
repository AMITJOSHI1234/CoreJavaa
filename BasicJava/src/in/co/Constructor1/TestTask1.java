package in.co.Constructor1;

public class TestTask1 {
public static void main(String[] args) {
	ConstructorTask1 c = new ConstructorTask1("jai Rathod","3 PeterStreet LosAngelis,USA","07/05/88");
	
	String name = c.getname();
	System.out.println("Name:"+name);
	String address = c.getaddress();
	System.out.println("Address"+address);
	String dob = c.getdob();
	System.out.println("DOB:"+dob);
}
}
