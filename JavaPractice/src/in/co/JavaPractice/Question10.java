package in.co.JavaPractice;

public class Question10 {
public static void main(String[] args) {
	int num1 =152;
	armstrong ar = new armstrong();
	int num2 = ar.arm(num1);
	if(num1 == num2) {
		System.out.println("Num is armstrong");
	} else {
		System.out.println("Num is not armstrong");
	}
}
}

class armstrong {
	public int arm(int num) {
		int check =0;
		while(num!=0) {
			int digit = num%10;
			check = digit *digit *digit +check;
			num = num/10;
		}
		
		return check;
	}
}
