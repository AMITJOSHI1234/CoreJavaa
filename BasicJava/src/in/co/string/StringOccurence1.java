package in.co.string;

public class StringOccurence1 {
public static void main(String[] args) {
	String s1 = "aabbccddeeffff";
	for(char i ='a';i<='f';i++) {
		int count = 0;
		for(int j=0;j<s1.length();j++) {
			if(i == s1.charAt(j)) {
				count++;
			}
		}		
		System.out.println(i +"="+count);
		
		
	}
}
}
