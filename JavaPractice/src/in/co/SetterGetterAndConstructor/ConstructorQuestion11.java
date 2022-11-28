package in.co.SetterGetterAndConstructor;

public class ConstructorQuestion11 {
private int num;

public void getprime() {
	int c =num/2;
	int count =0;
	
	for(int i =2 ; i<c ;i++) {
		if(num%i==0) {
			count++;
		}
	}
	
	if(count == 0) {
		System.out.println("Num is prime");
	} else {
		System.out.println("Number is not prime");
	}
	
}

public ConstructorQuestion11(int num) {
	this.num = num;
}
}
