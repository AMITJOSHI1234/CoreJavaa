package in.co.Polymorphism;

public class ChildAxis extends BankParent {
 
	public double IntrestRate() {
		super.IntrestRate();
		return 11.12;
	}
	
	public String getName() {
		super.getName();
		return "Axis Bank";
	}
}
