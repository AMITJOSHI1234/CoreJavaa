package in.co.rays;

public class Armstrong1 {
public static void main(String[] args) {
	int num = 154 , num1=154 , check=0;
	while(num!=0) {
		int digit = num%10;
		check = digit*digit*digit + check;
		num = num/10;
	}
	
	if(check == num1) {
		System.out.println("Number is armstrong");
	} else {
		System.out.println("Number is not armstrong");
	}
}
}
