package in.co.JavaPractice;

public class Question6 {
public static void main(String[] args) {
	fabonacci.fabo();
}
}

class fabonacci{
	public static void fabo() {
		int a=0,b=1,c;
		for(int i =1;i<=5;i++) {
			c =a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
