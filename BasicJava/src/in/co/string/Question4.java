package in.co.string;

public class Question4 {
public static void main(String[] args) {
	String s1 = "SunRays";
	
	for(int i=0 ; i<s1.length();i++) {
		if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') {
			System.out.println("Vovels are present in sunrays :" +s1.charAt(i));
		} 	
}
}
}
