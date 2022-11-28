package in.co.ExceptionalHandeling;

public class basicQuestion5 {
public static void main(String[] args) {
	int num = 123 , rev=0;
	
	try {
		while(num!=0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		
		System.out.println("Reverse of a number is:"+rev);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exceptional handeling");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	finally {
		System.out.println("OKK!!!");
	}
}
}
