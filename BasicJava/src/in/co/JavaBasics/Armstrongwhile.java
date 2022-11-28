package in.co.JavaBasics;

public class Armstrongwhile {
public static void main(String[] args) {
	int num = 153, check=0 , num1=153;
	
	while(num!=0) {
		int digit = num%10;
		check = digit * digit *digit +check;
		num = num/10;
	}
	
	if(check == num1) {
		System.out.println("Number is armstrong");
	}else
		System.out.println("Number is not armstrong");
}
}
