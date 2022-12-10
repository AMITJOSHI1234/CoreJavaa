package in.co.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableEmployee implements Externalizable {
transient int temp;
public String name;
public String address;
public String department;
public int salary;

public void setTemp(int temp) {
	this.temp = temp;
}

public int getTemp() {
	return temp;
}

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

@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeObject(address);
	out.writeObject(department);
	out.writeInt(salary);
	out.writeInt(temp);	
}

@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	name = (String)in.readObject();
	address = (String)in.readObject();
	department = (String)in.readObject();
	salary = in.readInt();	
}

}
