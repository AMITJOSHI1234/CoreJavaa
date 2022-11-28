package in.co.JavaBasics;

public class CalciusingSwitch {
  public static void main(String[] args) {
	int a = 10;
	int b = 20;
	char op = '/';
	
	switch(op) {
	case '+':{
		int c =a+b;
		System.out.println("Addition:"+c);
		break;
	}
	case '-':{
		if(a>b) {
			int c = a-b;
			System.out.println("Subtraction:"+c);
		}else {
			int c = b-a;
			System.out.println("Subtraction:"+c);
		}
		break;
	}
	case '*':{
		int c = a*b;
		System.out.println("Multiplication:"+c);
		break;
	}
	case '/':{
		if(a>b) {
			double c = a/b;
			System.out.println("Divide:"+c);
		} else {
			double c = b/a;
			System.out.println("Divide"+c);
		}
		break;
	}
	default:
		System.out.println("Invalid choice!!!!");
	}
}
}
