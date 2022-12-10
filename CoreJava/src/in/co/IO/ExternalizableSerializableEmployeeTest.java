package in.co.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizableSerializableEmployeeTest {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("D:\\employee2.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	ExternalizableEmployee ex = new ExternalizableEmployee();
	
	ex.setName("Amit");
	ex.setAddress("Wellinton street , NewZland");
	ex.setDepartment("Java Devloper And Data Scientics");
	ex.setSalary(5000000);
	ex.setTemp(4000);
	
	out.writeObject(ex);
	out.close();
	System.out.println("Done");
}
}
