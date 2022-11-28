package in.co.ClassAndObject;

public class ClassStatic2 {
public static void main(String[] args) {
	int m = 10;
	int n = 30;
	
	int value1 = Sum2.add(m, n);
	System.out.println("Add:"+value1);
	int value2 = Sum2.sub(m, n);
	System.out.println("Sub:"+value2);
	int value3 = Sum2.mul(m, n);
	System.out.println("Mul:"+value3);
	int value4 = Sum2.divide(m, n);
	System.out.println(value4);
}
}
