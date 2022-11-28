package in.co.ExceptionalHandeling;

public class BasicsQuestion1 {
public static void main(String[] args) {
	int a =10;
	int b = 20;
	
	try {
		if(a>b) {
			System.out.println("A is greter:"+a);
		}else {
			System.out.println("B is greter:"+b);
		}
		
	} catch (Exception e) {
		System.out.println("Your program has an exception");
		System.out.println(e.getMessage());
	}
	
}
}
