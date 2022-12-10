package in.co.IO;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryData1 {
public static void main(String[] args) throws IOException  {
	String source  = "D:/goku.jpg";
	String target = "D:/goku1.jpg";
	
	FileInputStream  fis = new FileInputStream(source);
	FileOutputStream fos = new FileOutputStream(target);
	
	int ch = fis.read();
	
	while(ch!=-1) {
		fos.write(ch);
		ch = fis.read();
	}
	
	fis.close();
	fos.close();
	
	System.out.println(source +"is coped to "+target);
}
}
