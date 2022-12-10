package in.co.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizableSerializableTest {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("D:\\Object2.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	ExternalizableMarksheet m = new ExternalizableMarksheet();
	
	m.setName("Amit");
	m.setMaths(95);
	m.setPhysics(92);
	m.setChemistry(91);
	m.setTemp(55);
	
	out.writeObject(m);
	
	out.close();
	file.close();
	
	System.out.println("Done");
}
}
