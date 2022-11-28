package in.co.ClassAndObject;

public class Sum {
public int add(int m,int n) {
	return m+n;	
}

public int sub(int m,int n) {
	if(m>n) {
		return m-n;
	}else {
		return n - m;
	}
}

public int mul(int m , int n) {
	return m*n;
}

public double divide(int m , int n) {
	if(m>n) {
		return m/n;
	}else {
		return n/m;
	}
}
}
