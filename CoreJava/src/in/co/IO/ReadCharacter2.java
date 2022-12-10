package in.co.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacter2 {
public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("D:/read.txt");
	
	int ch = reader.read();
	
	while(ch!=-1) {
		System.out.println((char)ch);
		ch = reader.read();
	}
	
	reader.close();
}
}
