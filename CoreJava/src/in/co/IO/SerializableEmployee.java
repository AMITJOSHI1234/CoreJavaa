package in.co.IO;

import java.io.Serializable;

public class SerializableEmployee implements Serializable {
 transient int temp;
 public String name;
 public String address;
 public String department;
 public int salary;
 
 public void setName(String name) {
	 this.name = name;
 }
 
 public String getName() {
	 return name;
 }
 
 public void setAddress(String address) {
	 this.address = address;
 }
 
 public String getAddress() {
	 return address;
 }
 
 public void setDepartment(String department) {
	 this.department = department;
 }
 
 public String getDepartment() {
	 return department;
 }
 
 public void setSalary(int salary) {
	 this.salary = salary;
 }
 
 public int getSalary() {
	 return salary;
 }
 
 public void setTemp(int temp) {
	 this.temp = temp;
 }
 
 public int getTemp() {
	 return temp;
 }
}
