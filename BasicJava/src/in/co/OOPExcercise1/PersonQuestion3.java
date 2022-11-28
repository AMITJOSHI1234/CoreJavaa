package in.co.OOPExcercise1;

public class PersonQuestion3 {
private String fname;
private String lname;

public String getFname() {
	return fname;
}

public String getLname() {
	return lname;
}

public PersonQuestion3(String fname , String lname) {
	this.fname = fname;
	this.lname = lname;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return fname + " " + lname;
}


}
