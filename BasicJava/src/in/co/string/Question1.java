package in.co.string;
public class Question1 {
public static void main(String[] args) {
	String s1 = "Vijay";
	String s2 = "Chauhan";
	
	System.out.println(s1 +" "+ s2);
	
	StringBuffer s3 = new StringBuffer("K.G.F");
	StringBuffer s4 = new StringBuffer("Chapter 2");
	
	s3.append(" "+s4);
	System.out.println(s3);
}
}
