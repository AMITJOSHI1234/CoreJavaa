package in.co.SetterGetterAndConstructor;

public class setterQuestion1 {
private int a;
private int b;

public void setnum(int a , int b) {
	this.a = a;
	this.b = b;
}

public int getnum() {
	if(a>b) {
		return a;
	}else {
		return b;
	}
}
}
