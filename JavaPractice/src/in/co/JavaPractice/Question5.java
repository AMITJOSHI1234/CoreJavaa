package in.co.JavaPractice;

public class Question5 {
public static void main(String[] args) {
	Reverse rev1 = new Reverse();
	int reverse = rev1.rev(123);
	System.out.println("Reverse of a number is:"+reverse);
	
}
}

class Reverse{
	public int rev(int num) {
		int rev = 0;
		
		while(num!=0) {
			int digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		
		return rev;
	}
}
