package in.co.ExceptionalHandeling;

public class callStack {
public static void main(String[] args) {
	dad();
}

public static void dad() {
	try {
		mom();
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception occurs in son method");
	}
}

public static void mom() {
	son();
}
public static void son() {
	int a = 10;
	int b = 0;
	int c =a/b;
	System.out.println(c);
}
}
