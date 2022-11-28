package in.co.ClassAndObject;

public class Sum2 {
public static int add(int a , int b) {
	return a+b;
}
public static int sub(int a , int b) {
	if(a>b) {
		return a-b;
	}else {
		return b-a;
	}
}
public static int mul(int a , int b) {
	return a*b;
}
public static int divide(int a ,int b) {
	if(a>b) {
		return a/b; 
	}else {
		return b/a;
	}
}
}
