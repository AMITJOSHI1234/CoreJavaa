package in.co.ExceptionalHandeling;

public class basicQuestion6 {
public static void main(String[] args) {
	int a = 0 , b=1;
	try {
		for(int i = 1 ; i<=5 ;i++) {
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	} catch (Exception e) {
		System.out.println("Exception is their in program");
	}
	
	finally {
		System.out.println("Program is running okk");
	}
}
}
