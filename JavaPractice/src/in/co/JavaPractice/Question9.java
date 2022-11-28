package in.co.JavaPractice;

public class Question9 {
public static void main(String[] args) {
	trangle.star();
}
}

class trangle{
	public static void star() {
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}
