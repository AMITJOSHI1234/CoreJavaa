package in.co.SetterGetterAndConstructor;

public class TestQuestion1 {
public static void main(String[] args) {
	int a =30;
	int b=10;
	setterQuestion1 se = new setterQuestion1();
	se.setnum(a, b);
	
	int max = se.getnum();
	System.out.println("largest number is:"+max);
}
}
