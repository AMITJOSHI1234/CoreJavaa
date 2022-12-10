package in.co.Collection;

public class HashCodemain {
public static void main(String[] args) {
	HashCode1 h1 = new HashCode1("101", "amit", 95);
	HashCode1 h2 = new HashCode1("102", "amit", 85);
	
	int hashcode1 = h1.hashCode();
	int hashcode2 = h2.hashCode();
	System.out.println(hashcode1);
	System.out.println(hashcode2);
	
	if(hashcode1 == hashcode2) {
		System.out.println("Hashcode/refrence are same");
		if(h1.equals(h2)) {
			System.out.println("Both name are same");
		} else {
			System.out.println("Both name are not same");
		}
	}
}
}
