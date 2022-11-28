package in.co.ExceptionalHandeling;

public class ThrowKeyword {
public static boolean isValidUser() {
	return false;
}

public static void main(String[] args) {
	boolean userFound = isValidUser();
	try {
	if(userFound == true) {
		System.out.println("Valid user");
	}else {
		RuntimeException e = new RuntimeException("invalid user");
		throw e;
	}
	}catch(Exception e) {
		System.out.println("Exception handeled");
		System.out.println("User is not valied");
	}
}

}
