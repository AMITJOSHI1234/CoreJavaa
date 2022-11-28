package in.co.Constructor1;

public class Class1 {

	private String fname;
	private String lname;
	private String dob;
	public Class1(String fname , String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getfname() {
		return fname;
	}
	
	public String getlname() {
		return lname;
	}
	
	public String getdob() {
		return dob;
	}
	
	public Class1(String f , String l , String dob) {
		this(f,l);
		this.dob = dob;
	}
}
