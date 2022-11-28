package in.co.ExceptionalHandeling;

public class multiplecatch {
public static void main(String[] args) {
	int  a =  10;
	int b = 0;
	
	try {
		int c = a/b;
		System.out.println("C:"+c);
	} catch (ArithmeticException e) {
		System.out.println("Exception occurs");	
	} catch (RuntimeException e) {
		// TODO: handle exception
		System.out.println("Runtime Exception");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception");
	}
	
}
}
