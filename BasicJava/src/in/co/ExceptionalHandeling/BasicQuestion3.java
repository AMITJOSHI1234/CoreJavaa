package in.co.ExceptionalHandeling;

public class BasicQuestion3 {
public static void main(String[] args) {
	try {
		for(int i =10 ; i<16; i++) {
			System.out.println(i);
		}
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your program have exception");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	finally {
		System.out.println("Question 2 of basic Excersise");
	}
}
}
