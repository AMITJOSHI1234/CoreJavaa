package in.co.OOPExcercise1;

public class Employee implements Cloneable {
public String localaddress;
public String peraddress;

public Employee(String local , String per) {
	this.localaddress = local;
	this.peraddress = per;
}

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}

/*public static void main(String[] args) throws CloneNotSupportedException {
	Employee e = new Employee("NZ", "AUS");
	Employee e1 = (Employee) e.clone();
	
	System.out.println(e1.localaddress);
	System.out.println(e1.peraddress);
}*/
}
