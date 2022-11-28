package in.co.ExceptionalHandeling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FinallyKeyword {
public static void main(String[] args) throws IOException {
	InputStream input = null;
	
	try {
		input = new FileInputStream("F:\\CoreJava\\BasicJava\\src\\in\\co\\ExceptionalHandeling\\file.txt");
		int data = input.read();
		
		while(data!=-1) {
			System.out.print((char) data);
			data = input.read();
		}
	} finally {
		if(input != null) {
			input.close();
		}
	}
}
}
