package in.co.Genric;

public class DataMain {
public static void main(String[] args) {
	Data<Integer> d = new Data<Integer>(100);
	
	d.ShowType();
	
	int v = d.getValue();
	System.out.println("Value of v is:"+v);
	
	Data<String> str = new Data<String>("Vijay");
	str.ShowType();
	
	String str1 = str.getValue();
	System.out.println("String str1:"+str1);
	
}
}
