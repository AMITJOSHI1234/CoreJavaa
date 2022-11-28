package in.co.Inheritance;

public class Question1Bussinessman extends Question1Person {

private  double income;

public void setIncome(double d) {
	this.income = d;
}

public double getIncome() {
	return income;
}

public Question1Bussinessman(String name, String address, String dob) {
	super(name, address, dob);
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
