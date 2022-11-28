package in.co.JavaPractice;

public class JavaPractice {
public static void main(String[] args) {
	JavaPractice jp =new JavaPractice();
	int max = jp.max(50, 40);
	System.out.println("Largest number is:"+max);
}

public int max(int a , int b) {
	if(a>b) {
		return a;
	}else {
		return b;
	}
}
}
