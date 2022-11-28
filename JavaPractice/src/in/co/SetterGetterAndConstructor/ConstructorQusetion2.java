package in.co.SetterGetterAndConstructor;

public class ConstructorQusetion2 {
private int a;
private int b;
private int c;

public int get() {
	if(a<b && a<c) {
		return a;
	} else if(b<c) {
		return b;
	} else {
		return c;
	}
}

public ConstructorQusetion2(int a , int b , int c) {
	this.a = a;
	this.b = b;
	this.c =c;
}
}
