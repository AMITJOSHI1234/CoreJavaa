package in.co.ExceptionalHandeling;

public class basicQuestion10 {
public static void main(String[] args) {
	int num =153 ,  num1 = 153 , check=0;
	
	try {
		while(num!=0) {
			int digit = num%10;
			check = digit*digit*digit + check;
			num = num/10;
		}
		
		if(num1 == check ) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	finally {
		System.out.println("Thankyou");
	}
}
}
