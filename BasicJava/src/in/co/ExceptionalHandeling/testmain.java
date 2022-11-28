package in.co.ExceptionalHandeling;

public class testmain {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	
	try {
		int c = a/b;
		System.out.println("Sum:"+c);
	} catch (Exception e) {
	  System.out.println("Divide by 0");
	  e.printStackTrace();
	  System.out.println(e.getMessage());
	}
	
	finally {
		System.out.println("This is finally block");
	}
}
}
