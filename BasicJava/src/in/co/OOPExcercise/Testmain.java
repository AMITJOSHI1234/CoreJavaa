package in.co.OOPExcercise;

public class Testmain {
public static void main(String[] args) {
	StaticOverriding s [] =new StaticOverriding[2];
	
	s[0] = new ChildOverridding();
	s[1] = new StaticOverriding();
	
	sending(s);
}

  public static void sending(StaticOverriding s[]) {
	for(StaticOverriding s1 : s) {
		s1.sum();
	}
}
}
