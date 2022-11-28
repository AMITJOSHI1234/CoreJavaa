package in.co.rays;

public class LoopPractice {
public static void main(String[] args) {
	int num = 121 , reverse = 0,num1=121;
	while(num!=0) {
		int digit = num%10;
		reverse = reverse *10 + digit;
		num = num/10;
	}
	
	System.out.println("Reverse number is:"+reverse);
	
	if(num1==reverse)
	{
		System.out.println("Number is pallendrome");
	}else {
		System.out.println("Number is not pallendrome");
	}
}
}
