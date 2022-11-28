package in.co.Cloning;

public class ShallowCloning implements Cloneable {
public String name;
public String address;
public String dob;
public int income;

public ShallowCloning(String name , String address , String dob , int income) {
	this.name = name;
	this.address = address;
	this.dob = dob;
	this.income =income;
}

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}

public static void main(String[] args) throws CloneNotSupportedException {
	ShallowCloning s = new ShallowCloning("Aman Shukla", "Vijay nagar", "10/2/97", 10000);
    ShallowCloning s1 = (ShallowCloning) s.clone();
    
    System.out.println("Orignal");
    System.out.println(s.name);
    System.out.println(s.address);
    System.out.println(s.dob);
    System.out.println(s.income);
    System.out.println("---------------------------------------------------------");
    System.out.println("Clone");
    System.out.println(s1.name);
    System.out.println(s1.address);
    System.out.println(s1.dob);
    System.out.println(s1.income);
}
}
