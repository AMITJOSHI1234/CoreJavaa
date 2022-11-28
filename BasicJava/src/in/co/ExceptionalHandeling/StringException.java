package in.co.ExceptionalHandeling;

public class StringException {
public static void main(String[] args) {
	String s = "SunRays";
	
	try {
	for(int i =0 ; i<=s.length();i++) {
		System.out.println(s.charAt(i));
	}
	}catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		System.out.println("String Exception");
	}
	}
}

