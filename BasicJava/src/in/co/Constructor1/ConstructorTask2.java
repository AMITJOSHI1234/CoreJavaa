package in.co.Constructor1;

public class ConstructorTask2 {
private String Number;
private String Type;
private double balance;

public String getnumber() {
	return Number;
}

public String gettype() {
	return Type;
}

public double getbalance() {
	return balance;
}
public double deposite(int money) {
	this.balance = this.balance + money;
	return this.balance;
}

public double withdraw(int money) {
	this.balance = this.balance - money;
	return this.balance;
}

public void fund() {
	System.out.println("Your account number is:"+this.Number);
	System.out.println("Your current amount is:"+this.balance);
	System.out.println("Your account type is:"+this.Type);
}

public ConstructorTask2(String number , String type , double amount) {
	this.Number = number;
	this.Type = type;
	this.balance = amount;
}

public ConstructorTask2() {
	super();
}
}
