package in.co.JavaBasics;

public class JavaBasics {
public static void main(String[] args) {
	// Calculator using if else
	int a =10;
	int b= 50;
	char op = '-';
	
	if(op == '+') {
		int c = a+b;
		System.out.println("Addition:"+c);
	}else if(op == '-') {
		if(a>b) {
			int c = a-b;
			System.out.println("Subtraction:"+c);
		}else {
			int c = b-a;
			System.out.println("Subtraction:"+c);
		}
	}else if(op == '*') {
		int c = a*b;
		System.out.println("Multiplication:"+c);
	}else if(op=='/') {
		if(a>b) {
			double c =a/b;
			System.out.println("Divide:"+c);
		}else {
			double c =b/a;
			System.out.println("Divide:"+c);
		}
	}else {
		System.out.println("Error!!!");
	}
}
}