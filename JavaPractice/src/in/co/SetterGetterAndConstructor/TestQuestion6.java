package in.co.SetterGetterAndConstructor;

public class TestQuestion6 {
public static void main(String[] args) {
	SetterQuestion6 se = new SetterQuestion6();
	
	se.setnum(123);
	se.setrev(0);
	
	int rev = se.getreverse();
	System.out.println("Reverse number is:"+rev);
}
}
