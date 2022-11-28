package in.co.SetterGetterAndConstructor;

public class setterQuestion12 {
private int num;

public void setnum(int num) {
	this.num = num;
}

public int getpalle() {
	int rev = 0;
	
	while(this.num!=0) {
	int	digit  = num%10;
		rev = rev*10 + digit;
		num = num/10;
	}
	
	return rev;
}
}
