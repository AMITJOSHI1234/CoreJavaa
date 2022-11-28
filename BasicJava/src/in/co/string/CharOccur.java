package in.co.string;

public class CharOccur {
public static void main(String[] args) {
	String s1 = "Occurrence";
	int count[] = new int[156];
	for(int i=0;i<s1.length();i++)
		count[s1.charAt(i)]++;
   char ch[] = new char[s1.length()];
   for(int i=0;i<s1.length();i++) {
	   ch[i] = s1.charAt(i);
	   int counter = 0;
	   for(int j=0;j<=i;j++) {
		   if(s1.charAt(i)==ch[j]) {
			   counter++;
		   }
		   if(counter == 1) {
			   System.out.println("The occurrence of" +s1.charAt(i)+"is " +count[s1.charAt(i)]);
		   }
	   }
   }
}
}
