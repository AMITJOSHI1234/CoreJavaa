package in.co.OOPExcercise;

public class Question5main {
public static void main(String[] args) {
	Question5Immutableclass q = new Question5Immutableclass(10, 20);
	
	int a = q.getA();
	System.out.println("Value of a:"+a);
	
	int b = q.getB();
	System.out.println("Value of b:"+b);
}
}
