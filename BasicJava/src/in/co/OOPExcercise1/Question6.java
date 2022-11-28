package in.co.OOPExcercise1;

public class Question6 {
public static void main(String[] args) {
	sum();
	int c = sum(10);
	System.out.println("C:"+c);
	sum(20,30);
}

public static void sum() {
	int a = 10;
	int b = 20;
	
	int c = a+b;
	System.out.println("C:"+c);
}

public static int sum(int a) {
	int b = 30;
	int c = a+b;
	return c;
}

public static void sum(int a , int b) {
	int c = a+b;
	System.out.println("C:"+c);
}
}
