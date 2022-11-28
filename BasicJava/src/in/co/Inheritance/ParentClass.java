package in.co.Inheritance;

public class ParentClass {
private String address;
private String dob;

public String getaddress() {
	return address;
}

public String getdob() {
	return dob;
}

public ParentClass(String address,String dob) {
	this.address = address;
	this.dob = dob;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

public ParentClass() {
	super();
}
}
