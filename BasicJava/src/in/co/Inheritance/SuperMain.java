package in.co.Inheritance;

public class SuperMain {
public static void main(String[] args) {
	//SuperParent p =new SuperParent(10, 20);
	
	SuperChild c  = new SuperChild(10, 20);
	
	int a = c.getA();
	System.out.println(a);
	
	int b = c.getB();
	System.out.println(b);
}
}
