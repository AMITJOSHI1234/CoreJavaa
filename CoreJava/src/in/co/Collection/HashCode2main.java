package in.co.Collection;

public class HashCode2main {
public static void main(String[] args) {
	HashCode2 hash = new HashCode2("101", "Amit", 95);
	HashCode2 hash1 = new HashCode2("102", "Amit", 92);
	
	System.out.println(hash.HashCode());
	System.out.println(hash1.HashCode());
	
	if(hash.HashCode() == hash1.HashCode()) {
		System.out.println("Refrence are equal");
		if(hash.equals(hash1)) {
			System.out.println("Both name are same");
		}else {
			System.out.println("Both name are not same");
		}
	}else {
		System.out.println("Refrence are not same");
	}
}
}
