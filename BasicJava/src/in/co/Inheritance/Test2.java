package in.co.Inheritance;

public class Test2 {
public static void main(String[] args) {
	Parent2 p =new Parent2(10,30);
	Child2 c =new Child2();
	
	c.setA(10);
	c.setB(20);
	
	int a = c.getA();
	System.out.println("Value of a:"+a);
	
	int b = c.getB();
	System.out.println("Value of b:"+b);

}
}
