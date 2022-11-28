package in.co.SetterGetterAndConstructor;

public class TestQuestion3 {
public static void main(String[] args) {
	SetterQuestion3 se = new SetterQuestion3();
	se.setfact(1);
	
	int fact = se.getfact();
	System.out.println("Factorial of a number is:"+fact);
}
}
