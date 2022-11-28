package in.co.Encapusulation;

public class TestTask1 {
public static void main(String[] args) {
	EncapsulationTask1 en = new EncapsulationTask1();
	en.setaddress("3 peterson street road, Los angelis ,USA");
	en.setdob("05/07/92");
	en.setname("Rahul");
	
	String name = en.getname();
	System.out.println("Name is:"+name);
	
	String address = en.getaddress();
	System.out.println("Address is:"+address);
	
	String dob = en.getdob();
	System.out.println("Date of birth is:"+dob);
}
}
