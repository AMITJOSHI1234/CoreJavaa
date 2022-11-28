package in.co.SetterGetterAndConstructor;

public class TestQuestion14 {
public static void main(String[] args) {
	SetterQuestion14 s = new SetterQuestion14();
	s.setaverage(0);
	
	int average = s.getaverage1();
	System.out.println("Average of consecutive odd and even is:"+average);
}
}
