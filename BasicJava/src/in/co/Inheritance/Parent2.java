package in.co.Inheritance;

public class Parent2 {
private int a;
private int b;

public void setA(int a) {
	this.a = a;
}

public int getA() {
	return a;
}

public void setB(int b) {
	this.b = b;
}

public int getB() {
	return b;
}

public Parent2(int a , int b) {
	//int a =10;
	//int b =20;
	System.out.println("c:"+(a+b));
}

}
