package in.co.OOPExcercise;

public class Question3Constructor {
private String fname;
private String lname;

public Question3Constructor(String fname,String lname) {
	this.fname = fname;
	this.lname = lname;
}

public String getfname() {
	return fname;
}

public String getlname() {
	return lname;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	//return super.toString();
	return fname +" " + lname;
}
}
