package in.co.Arrays;

public class Array2 {
  public static void main(String[] args) {
	char CopyFrom [] = {'S','U','N','R','A','Y','S'};
	char CopyTo[] = new char[4];
	
	System.arraycopy(CopyFrom, 3, CopyTo, 0, 4);
	System.out.println(CopyFrom);
	System.out.println(CopyTo);
}
}
