package in.co.ExceptionalHandeling;

public class UncheckedExceptionPrepogation {
public static void main(String[] args) {
	dad();
}

public static void dad() {
	try {
		mom();
	} catch (Exception e) {
		System.out.println("Caught by dad , rise by son");
	}
}

public static void mom() {
	son();
}
public static void son() {
	RuntimeException e = new RuntimeException("Exception raised");
	throw e;
}
}
