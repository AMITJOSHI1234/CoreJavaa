package in.co.IO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializableEmployee {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("D:\\emplo.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	SerializableEmployee emp = new SerializableEmployee();
	
	emp.setName("Amit");
	emp.setAddress("36 Lakesite city , USA");
	emp.setDepartment("Java Devloper / Data Scientics");
	emp.setSalary(5000000);
	emp.setTemp(5000);
	
	out.writeObject(emp);
	out.close();
	
	System.out.println("Done");
	
}
}
