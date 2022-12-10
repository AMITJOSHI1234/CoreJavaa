package in.co.Genric;

public class Data2main {
public static void main(String[] args) {
	Data2<Integer> d = new Data2<Integer>(90);
	
	d.ShowType();
	
	int value = d.getValue();
	System.out.println("Value :"+value);
	
	Data2<String> str = new Data2<String>("Raj");
	
	str.ShowType();
	
	String str1 = str.getValue();
	System.out.println("String is:"+str1);
}
}
