package in.co.SetterGetterAndConstructor;

public class ConstructorQuestion7 {
private int sum;

public int getSum() {
	for(int i = 101;i<200;i++) {
		if(i%7 == 0) {
			sum  = sum+i; 
		}
	}
	
	return sum;
}

public ConstructorQuestion7(int sum) {
	this.sum = sum;
}
}
