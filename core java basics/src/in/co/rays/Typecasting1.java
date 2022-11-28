package in.co.rays;

public class Typecasting1 {
public static void main(String args[]) {
	double a = 10.58;
	double b = 14.29;
	double c;
	char op = '/';
	
	switch(op) {
	case '+': {
		 c = (int)a +(int) b;
		System.out.println("Addition:"+c);
		break;
	}
	case '-' : {
		c = (float)b -(int) a;
		System.out.println("Subtraction:"+c);
		break;
	}
	case '*': {
		c = (float)a * (int)b;
		System.out.println("Multiplication:"+c);
		break;
	}
	case '/': {
		c= b/a;
		System.out.println("Divide:"+c);
		break;
	}
	default:
		System.out.println("Invalid choice!!!!");
	}
	
}
}
