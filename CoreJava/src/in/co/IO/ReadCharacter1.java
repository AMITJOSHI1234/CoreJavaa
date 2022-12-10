package in.co.IO;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacter1 {
public static void main(String[] args) throws IOException {
	FileReader in = new FileReader("D:/read.txt");
	
	int ch = in.read();
	
	while(ch!=-1) {
		System.out.println((char)ch);
		ch = in.read();
	}
	
	in.close();
}
}
