package in.co.SetterGetterAndConstructor;

public class SetterQuestion10 {
private int num1;

public void setnum(int num1) {
	this.num1 = num1;
}

public int getrev() {
	int check = 0;
	while(num1!=0) {
	   int digit = num1%10;
	   check = digit * digit *digit + check;
	   num1 = num1/10;
	}
	
	return check;
}
}
