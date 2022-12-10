package in.co.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine1 {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("D:/read.txt");
	
	BufferedReader in = new BufferedReader(file);
	
	String line = in.readLine();
	
	while(line != null) {
		System.out.println(line);
		line = in.readLine();
	}
	
	in.close();
	file.close();
}
}
