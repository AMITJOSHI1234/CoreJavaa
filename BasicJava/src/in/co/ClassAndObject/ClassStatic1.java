package in.co.ClassAndObject;

public class ClassStatic1 {
public static void main(String[] args) {
	int a =10;
	int b= 20;
	
	int sum = ClassStatic1.sum(a,b);
	System.out.println(sum);
	
}

public static int sum(int m , int n) {
	return m+n;
}
}
