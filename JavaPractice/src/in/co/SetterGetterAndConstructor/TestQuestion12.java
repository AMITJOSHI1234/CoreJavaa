package in.co.SetterGetterAndConstructor;

public class TestQuestion12 {
public static void main(String[] args) {
	setterQuestion12 se = new setterQuestion12();
	se.setnum(123);
	
	int num1= 121;
	
	int check = se.getpalle();
	
	if(check == num1) {
		System.out.println("Number is pallendrome");
	} else {
		System.out.println("Number is not pallendrome");
	}
}
}
