package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserializationMarksheet {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream file = new FileInputStream("D:\\Object1.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	SerializableMarksheet m = (SerializableMarksheet) in.readObject();
	
	System.out.println("Name:"+m.getName());
	System.out.println("Maths"+m.getMaths());
	System.out.println("Physics:"+m.getPhysics());
	System.out.println("Chemistry:"+m.getChemistry());
	System.out.println("TempValue:"+m.getTempValue());
	
	in.close();
}
}
