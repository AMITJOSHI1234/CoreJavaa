package in.co.Encapusulation;

public class EncapsulationTask2 {
private String number;
private String type;
private double amount;

public void setnumber(String number) {
	this.number = number;
}

public String getnumber() {
	return number;
}

public void settype(String type) {
	this.type = type;
}

public String gettype() {
	return type;	
}

public void setamount(double amount) {
	this.amount = amount;
}

public double getamount() {
	return amount;
}

public double deposite(double amount) {
	this.amount = this.amount+amount;
	return this.amount;
}

public double withdraw(double withdraw) {
	this.amount = this.amount - withdraw;
	return this.amount;
}

public void fundTransfer(String accnum, double amount) {
	System.out.println("Your account number is:"+accnum);
	System.out.println("Your amount is:"+amount);
}
}
