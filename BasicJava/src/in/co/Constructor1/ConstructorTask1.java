package in.co.Constructor1;

public class ConstructorTask1 {
private String name;
private String address;
private String dob;

public String getname() {
	return name;
}

public String getaddress() {
	return address;
}

public String getdob() {
	return dob;
}

public ConstructorTask1(String name,String address,String dob) {
	this.name = name;
	this.address = address;
	this.dob = dob;
}

public ConstructorTask1() {
	super();
}
}
