package in.co.ClassAndObject;

public class ClassTest1 {
public static void main(String[] args) {
	int a = 10;
	int b=20;
	
	ClassTest1 cls = new ClassTest1();
	int add = cls.add(a,b);
	int sub = cls.sub(a,b);
	int mul = cls.mul(a,b);
	double divide = cls.div(a,b);
	System.out.println("Addition:"+add);
	System.out.println("Subtraction:"+sub);
	System.out.println("Multiplication:" +mul);
	System.out.println("Divide:"+divide);
}

public int add(int m,int n) {
	return m+n;
}

public int sub(int m,int n) {
	if(m>n) {
		return m-n;
	}else {
		return n-m;
	}
}

public int mul(int m ,int n) {
	return m*n;
}

public double div(int m , int n) {
	if(m>n) {
		return m/n;
	}else {
		return n/m;
	}
}
}
