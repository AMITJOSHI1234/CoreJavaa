package in.co.ClassAndObject;

public class ClassTest {
public static void main(String[] args) {
	int a = 10;
	int b= 20;
	
	ClassTest cls = new ClassTest();
	int value = cls.sum(a,b);
	System.out.println("Addition:"+value);
}

public int sum(int m , int n) {
	return m+n;
}
}
