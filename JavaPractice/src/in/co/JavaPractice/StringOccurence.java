package in.co.JavaPractice;

public class StringOccurence {
public static void main(String[] args) {
	String s1 = "sunrays";
	
	for(char i ='a' ;i<='z';i++) {
		int count = 0;
		for(int j = 0 ; j<s1.length();j++) {
			if(i == s1.charAt(j)) {
				count++;
			}
		}
		System.out.println(i +" - " + count);
	}
}
}
