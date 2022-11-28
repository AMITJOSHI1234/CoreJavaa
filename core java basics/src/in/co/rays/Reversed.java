package in.co.rays;

public class Reversed {
public static void main(String[] args) {
	int num=1234, reversed=0;
	while(num!=0) {
		int digit=num%10;
		reversed=reversed*10 + digit;
		num=num/10;
	}
	System.out.println("Reverse number is:"+reversed);
}
}
