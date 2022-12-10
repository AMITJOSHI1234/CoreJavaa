package in.co.IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableDeSerializableTest {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	FileInputStream file = new FileInputStream("D:\\Object2.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	ExternalizableMarksheet m = (ExternalizableMarksheet) in.readObject();
	
	System.out.println("Name:"+m.getName());
	System.out.println("Maths:"+m.getMaths());
	System.out.println("Physics:"+m.getPhysics());
	System.out.println("Chemistry:"+m.getChemistry());
	System.out.println("TempValue:"+m.getTemp());
	
	in.close();
	file.close();
	
}
}
