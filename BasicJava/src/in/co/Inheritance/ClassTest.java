package in.co.Inheritance;

public class ClassTest {
public static void main(String[] args) {
	ChildClass c = new ChildClass();
	ParentClass p = new ParentClass("USA", "08/05/1997");
	//ParentClass p1 = new ChildClass();
	
	
	System.out.println(p.getaddress());
	System.out.println(p.getdob());
	
	c.setfname("Jay");
	c.setlname("shah");
	c.setid(1);
	
	String fname = c.getfname();
	System.out.println(fname);
	
	String lname = c.getlname();
	System.out.println(lname);
	
	int id = c.getid();
	System.out.println(id);	
}
}
