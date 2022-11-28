package in.co.Cloning;
//deep cloning
public class customer1 implements Cloneable {
public String name = null;
BankAccount1 bank = null;

public customer1(String name) {
	this.name = name;
	bank = new BankAccount1(50000);
}

public Object clone() throws CloneNotSupportedException {
	customer1 c = (customer1)super.clone();
	 c.bank = (BankAccount1)bank.Clone();
	 return c;
}

public static void main(String[] args) throws CloneNotSupportedException {
	customer1 c1 = new customer1("Jay");
	customer1 c2 = (customer1)c1.clone();
	
	System.out.println(c2.name);
	System.out.println(c2.bank.balance);
}
}
