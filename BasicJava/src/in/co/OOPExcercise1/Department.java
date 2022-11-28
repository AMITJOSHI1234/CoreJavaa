package in.co.OOPExcercise1;

public class Department implements Cloneable {
public String employe1;
public String employ2;
Employee e = null;
Address a = null;


public Department(String em1, String em2) {
	employe1 = em1;
	employ2 = em2;
	 e = new Employee("108 LakeWise Road", "221 Anderson Road");
	 a = new Address("Boston", "USA");
}

public Object clone() throws CloneNotSupportedException {
	Department d = (Department) super.clone();
	d.e = (Employee) e.clone();
	d.a = (Address) a.clone();
	return d;
}

public static void main(String[] args) throws CloneNotSupportedException {
	Department d1  = new Department("Rahul", "Yatin");
	Department d2 = (Department) d1.clone();
	
	System.out.println("After Cloning");
	
	System.out.println(d2.employe1);
	System.out.println(d2.employ2);
	System.out.println(d2.e.localaddress);
	System.out.println(d2.e.peraddress);
	System.out.println(d2.a.state);
	System.out.println(d2.a.country);
}
}
