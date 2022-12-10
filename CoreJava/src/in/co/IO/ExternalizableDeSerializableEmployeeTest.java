package in.co.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableDeSerializableEmployeeTest {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream file = new FileInputStream("D:\\employee2.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	ExternalizableEmployee em = (ExternalizableEmployee)in.readObject();
	
	System.out.println("Name:"+em.getName());
	System.out.println("Address:"+em.getAddress());
	System.out.println("Department:"+em.getDepartment());
	System.out.println("Salary:"+em.getSalary());
	System.out.println("Temp:"+em.getTemp());
	
	in.close();
}
}
