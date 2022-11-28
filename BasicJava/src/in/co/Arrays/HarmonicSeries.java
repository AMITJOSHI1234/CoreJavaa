package in.co.Arrays;

public class HarmonicSeries {
 public static void main(String[] args) {
	int num = 5;
	double sum=0.0;
	
	for(int i=1;i<=num;i++) {
		System.out.println("/"+i+" + ");
		sum = sum + (double)1/i;
	}
	System.out.println("Harmonic series:"+sum);
}
}
