package in.co.Collection;

public class Testmain {
public static void main(String[] args) {
	HashCodeNEquals1 h1 = new HashCodeNEquals1("A1", "Shreya", 95);
	HashCodeNEquals1 h2 = new HashCodeNEquals1("A1", "Sayna", 85);
	
	
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
	
	
	if(h1.hashCode() == h2.hashCode()) {
		if(h1.equals(h2)) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
	}
}
}
