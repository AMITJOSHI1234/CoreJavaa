package in.co.ExceptionalHandeling;

public class basicQuestion9 {
public static void main(String[] args) {
	try {
		for(int i = 1 ;i<5 ;i++) {
			for (int j = 1 ; j<=i ;j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your program has no exception");
	}
	
	finally {
		System.out.println("Thankyou!!!");
	}
}
}
