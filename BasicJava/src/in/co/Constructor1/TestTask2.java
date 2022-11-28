package in.co.Constructor1;

public class TestTask2 {
public static void main(String[] args) {
	ConstructorTask2 c =new ConstructorTask2("100100100100", "Saving Account", 500.20);
	
	String accnum = c.getnumber();
	System.out.println("Your acc number is:"+accnum);
	
	String type = c.gettype();
	System.out.println("Your account type is:"+type);
	
	double amount = c.getbalance();
	System.out.println("Your account balance is:"+amount);
	
	double deposite = c.deposite(500);
	System.out.println("Your account balance after deposite is:"+deposite);
	
	double withdraw = c.withdraw(200);
		System.out.println("Your account balance after withdraw is:"+withdraw);
		
		c.fund();
	
}
}
