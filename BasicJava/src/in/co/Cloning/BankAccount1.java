package in.co.Cloning;
//Shallow cloning
public class BankAccount1 implements Cloneable {
public double balance = 0;
public BankAccount1(double balance) {
	//super();
	this.balance = balance;
}

public Object Clone() throws CloneNotSupportedException {
	return super.clone();
}

public static void main(String[] args) throws CloneNotSupportedException {
	BankAccount1 bank = new BankAccount1(1000000);
	BankAccount1 bank1 = (BankAccount1) bank.Clone();
	
	System.out.println("Orignal:"+bank.balance);
	System.out.println("Clone:"+bank1.balance);
	
	bank1.balance = 2000000;
	System.out.println(bank1.balance);
}
}
