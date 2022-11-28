package in.co.OOPExcercise1;

public class Question7 {
public static void main(String[] args) {
	Question7Bank b [] = new Question7Bank[2];
	b[0] = new Question7SBI();
	b[1] = new Question7BOI();
	
	details(b);
}

public static void details(Question7Bank b []) {
	for(Question7Bank b1 :b) {
		System.out.println(b1.Bankname());
		System.out.println(b1.intrest());
	}
}
}
