package in.co.ExceptionalHandeling;

public class basicQuestion4 {
public static void main(String[] args) {
	try {
		int fact =1;
		for(int i =5 ; i>0 ;i--) {
			fact = fact*i;
			System.out.println(fact);
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your program has an exception");
		e.printStackTrace();
	    System.out.println(e.getMessage());
	}
}
}
