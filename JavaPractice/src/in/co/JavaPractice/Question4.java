package in.co.JavaPractice;

public class Question4 {
public static void main(String[] args) {
	fact f1 = new fact();
	int fact = f1.fact1(1);
	System.out.println("Factorial is:"+fact);
	
}
}

class fact{
public int fact1(int f) {
	for(int i=5;i>0;i--) {
		f = f*i;
	}
	
	return f;
}
}
