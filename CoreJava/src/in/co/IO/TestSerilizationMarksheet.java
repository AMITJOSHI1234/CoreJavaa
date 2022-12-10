package in.co.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerilizationMarksheet {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("D:\\Object1.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	SerializableMarksheet m = new SerializableMarksheet();
	
	m.setName("Amit");
	m.setMaths(95);
	m.setPhysics(92);
	m.setChemistry(91);
	m.setTempValue("786");
	
	out.writeObject(m);
	System.out.println("Done");
}
}
