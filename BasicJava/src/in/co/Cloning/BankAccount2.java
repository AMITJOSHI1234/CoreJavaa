package in.co.Cloning;
  //Shallow cloning
public class BankAccount2 implements Cloneable {
public double amount = 0;

public BankAccount2(double amount) {
	super();
	this.amount = amount;
}

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}

public static void main(String[] args) throws CloneNotSupportedException {
	BankAccount2 b = new BankAccount2(50000);
	BankAccount2 b1 = (BankAccount2) b.clone();
	
	System.out.println("Before cloning:"+b.amount);
	System.out.println("After cloning:"+b1.amount);
}
}
