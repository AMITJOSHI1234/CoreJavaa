package in.co.JavaPractice;

public class Question2 {
public static void main(String[] args) {
	int a =10;
	int b=20;
	int c =05;
	
	int small = Question2.small(a, b);
	System.out.println("Smallest number is:"+small);
	
	int small1 = Question2.small1(a, b, c);
	System.out.println("Another smallest number is:"+small1);
	
}

public static int small(int a,int b) {
	int small = (a<b)?a:b;
	
	return small;
}

public static int small1(int a,int b , int c) {
	if(a<b && a<c) {
		return a;
	}else if(b<c) {
		return b;
	}else {
		return c;
	}
}
}
