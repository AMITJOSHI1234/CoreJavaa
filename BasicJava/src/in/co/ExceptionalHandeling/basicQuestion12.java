package in.co.ExceptionalHandeling;

public class basicQuestion12 {
public static void main(String[] args) {
	int num =122 , num1 = 122 ,rev =0;
	try {
		while(num!=0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		
		if(num1 == rev) {
			System.out.println("number is pallendrome");
		}else {
			System.out.println("number is not pallendrome");
		}
	} catch (Exception e) {
		System.out.println("Your program has exception");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	finally {
		System.out.println("Thank you!!!!");
	}
}
}
