package in.co.OOPExcercise1;

public class Address implements Cloneable {
 public String state;
 public String country;
 
 public Address(String state , String country) {
	 this.state = state;
	 this.country = country;
 }
 
 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
 }
}
