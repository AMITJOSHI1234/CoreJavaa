package in.co.Constructor1;

public class Constructor1 {
private String fname;
private String lname;
private int id;

public String getfname() {
	return fname;
}

public String getlname() {
	return lname;
}

public int getid() {
	return id;
}
 //paramaterizes constructor
public Constructor1(String fname , String lname , int id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
 }
 //Default constructor
public Constructor1() {
	super();
}
}
