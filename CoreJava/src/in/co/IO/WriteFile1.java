package in.co.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile1 {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("D:/read.txt");
	
	writer.write("Kausliya Darshrat ke nandan");
	writer.write("\n");
	writer.write("Ram lalat pe shobhit chandan");
	writer.write("\n");
	writer.write("Ragupati ki jay bole laxman");
	writer.write("\n");
	writer.write("Ram siya ka ho abhinandan");
	
	writer.close();
	
	System.out.println("Check D:/read.txt");
	
}
}
