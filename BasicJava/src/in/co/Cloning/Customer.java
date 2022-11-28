package in.co.Cloning;
//deep cloning
public class Customer implements Cloneable {
public String name = null;
public BankAccount bank = null;

public Customer(String name) {
	this.name = name;
	bank = new BankAccount(5000);
}

public Object clone() throws CloneNotSupportedException {
	Customer c = (Customer)super.clone();
	c.bank = (BankAccount)bank.clone();
	return c;
}

public static void main(String[] args) throws CloneNotSupportedException {
	Customer c1 = new Customer("abc");
	Customer c2 = (Customer)c1.clone();
	
	System.out.println(c2.name);
	System.out.println(c2.bank.balance);
}
}