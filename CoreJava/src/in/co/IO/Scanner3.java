package in.co.IO;
import java.util.Scanner;
public class Scanner3 {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter two numbers");
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("Sum of two number is:"+c);
	}
}
}
