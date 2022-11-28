package in.co.Polymorphism;

public class TestHomeLoan {
public static void main(String[] args) {
	BankParent b [] = new BankParent[3];
	b[0] = new ChildAxis();
	b[1] = new ChildHDFC();
	b[2] = new ChildICICI();
	
	loanEnquiries(b);
}


public static void loanEnquiries(BankParent b []) {
	for(BankParent b1 : b) {
		System.out.println(b1.getName());
		System.out.println(b1.IntrestRate());
	}
}
}
