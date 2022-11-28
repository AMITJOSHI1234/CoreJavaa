package in.co.rays;

public class Question7 {
public static void main(String[] args) {
	int sum=0;
	for(int i=101;i<200;i++) {
		if(i%7==0)
		{
			sum = sum + i;
		}
	}
	System.out.println("Sum of numbers greter than 100 and smaller than 200 is:"+sum);
}
}
