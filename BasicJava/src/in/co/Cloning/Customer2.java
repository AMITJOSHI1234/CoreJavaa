package in.co.Cloning;
//deep Cloning
public class Customer2 implements Cloneable {
public String name = null;
BankAccount2 b = null;

public Customer2(String name) {
	this.name = name;
	
	b = new BankAccount2(5000);
}

public Object clone() throws CloneNotSupportedException {
	Customer2 c = (Customer2) super.clone();
	c.b = (BankAccount2)b.clone();
	
	return c;
}

public static void main(String[] args) throws CloneNotSupportedException {
	Customer2 c1 = new Customer2("Rajesh");
	Customer2 c2 = (Customer2) c1.clone();
	
	System.out.println(c2.name);
	System.out.println(c2.b.amount);
}
}
