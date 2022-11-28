package in.co.Inheritance;

public class Question1Doctor extends Question1Person {
private int registrationno;

public void setRegis(int res) {
	this.registrationno = res;
}

public int getRegis() {
	return registrationno;
}

public Question1Doctor(String address,String name ,String dob) {
	super(address , name , dob);
}
}
