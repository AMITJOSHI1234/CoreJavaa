package in.co.ClassAndObject;

public class Class1 {
public static void main(String[] args) {
	int a =10;
	int b=20;
	
	Sum s = new Sum();
	int value1 = s.add(a,b);
	System.out.println(value1);
	
	int value2 = s.sub(a, b);
	System.out.println(value2);
	
	int value3 = s.mul(a,b);
	System.out.println(value3);
	
	double value4 = s.divide(a, b);
	System.out.println(value4);
	
}
}
