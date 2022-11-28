package in.co.Encapusulation;

public class Assignment2 {
public static void main(String[] args) {
	EncapsulationTask2 en = new EncapsulationTask2();
	en.setamount(500.22);
	en.setnumber("1000100010001000100");
	en.settype("Saving account");
	
	double amount = en.getamount();
	System.out.println("Your amount:"+amount);
	
	String accnumber = en.getnumber();
	System.out.println("Your account number:"+accnumber);
	
	String type = en.gettype();
	System.out.println("Your acc type is:"+type);
	
	double deposite = en.deposite(200);
	System.out.println("Your amount after deposite:"+deposite);
	
	double withdraw = en.withdraw(100.50);
	System.out.println("Your amount after withdraw:"+withdraw);
	
	en.fundTransfer("1000100010001000100", withdraw);
}
}
