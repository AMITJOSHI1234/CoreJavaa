package in.co.SetterGetterAndConstructor;

public class SetterQuestion6 {
private int num;
private int rev;

public void setnum(int num) {
	this.num = num;
}

public void setrev(int rev) {
	this.rev = rev;
}

public int getreverse() {
	
	while(this.num!=0) {
		int digit = num%10;
		rev = rev*10 + digit;
		num = num/10;
	}
	
	return rev;
}
}
