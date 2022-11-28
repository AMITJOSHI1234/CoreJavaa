package in.co.Inheritance;

public class ChildClass extends ParentClass {
private String fname;
private String lname;
private int id;


public void setfname(String fname) {
	this.fname = fname;
}

public String getfname() {
	return fname;
}

public void setlname(String lname) {
	this.lname = lname;
}

public String getlname() {
	return lname;
}

public void setid(int id) {
	this.id = id;
}

public int getid() {
	return id;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

public ChildClass() {
	super();
}
}

