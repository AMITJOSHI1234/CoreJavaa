package in.co.SetterGetterAndConstructor;

public class SetterQuestion3 {
private int fact;

public void setfact(int num) {
	this.fact = num;
}

public int getfact() {
	for(int i=5;i>0;i--) {
		this.fact= this.fact*i;
	}
	return this.fact;
}
}
