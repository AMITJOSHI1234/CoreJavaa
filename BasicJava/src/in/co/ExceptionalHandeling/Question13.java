package in.co.ExceptionalHandeling;

public class Question13 {
public static void main(String[] args) {
	double sum = 0.0;
	try {
		for(int i =1 ;i<=10 ;i++) {
			sum = sum + (double)1/i;
		}
		
		System.out.println(sum);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your Programme has exception");
	}
	
	finally {
		System.out.println("Thankyou");
	}
}
}
