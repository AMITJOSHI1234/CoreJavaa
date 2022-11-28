package in.co.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question1Person {
private String name;
private String address;
private String dob;

public String getName() {
	return name;
}

public String getAddress() {
	return address;
}

public Date getDob() throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	Date d =sdf.parse(dob);
	return d;
}

public Question1Person(String name,String address , String dob) {
	this.address = address;
	this.name = name;
	this.dob = dob;
}
}
