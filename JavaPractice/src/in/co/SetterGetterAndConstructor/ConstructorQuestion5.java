package in.co.SetterGetterAndConstructor;

public class ConstructorQuestion5 {
private int a;
private int b;

public void getFabo() {
	for(int i=1;i<=5;i++) {
		int c =a+b;
		System.out.println(c);		
		a = b;
		b = c;	
	}
}
 
public ConstructorQuestion5(int a , int b) {
	this.a = a;
	this.b = b;
}

}
