package in.co.SetterGetterAndConstructor;

public class TestQuestion10 {
public static void main(String[] args) {
	SetterQuestion10 se = new SetterQuestion10();
	
	int num = 153;
	
	se.setnum(154);
	int check = se.getrev();
	
	if(check == num) {
		System.out.println("Number is armstrong");
	} else {
		System.out.println("Number is not armstrong");
	}
	
}
}
