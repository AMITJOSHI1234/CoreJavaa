package in.co.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeseriliazedEmployee {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream file = new FileInputStream("D:\\emplo.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	SerializableEmployee emp = (SerializableEmployee) in.readObject();
	
	System.out.println("Name:"+emp.name);
	System.out.println("Address:"+emp.address);
	System.out.println("Department:"+emp.department);
	System.out.println("Salary:"+emp.salary);
	System.out.println("Temp:"+emp.temp);
	
	in.close();
}
}
