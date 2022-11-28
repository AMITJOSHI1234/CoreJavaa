package in.co.JavaPractice;

public class Question12 {
public static void main(String[] args) {
	int num1 = 123;
	pallendrome pa =new pallendrome();
	int rev = pa.pallen(123);
	
	if(rev == num1) {
		System.out.println("Num is pallendrome");
	}else {
		System.out.println("Number is not pallendrome");
	}
}
}

class pallendrome {
	public int pallen(int num) {
		int rev = 0;
		
		while(num!=0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		
		return rev;
	}
}
